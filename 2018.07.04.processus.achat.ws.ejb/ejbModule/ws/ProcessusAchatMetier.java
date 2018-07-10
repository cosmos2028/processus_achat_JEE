package ws;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Commande;
import entity.Facture;
import entity.LigneCommande;
import entity.Livraison;
import entity.Utilisateur;

@WebService
@Stateless
public class ProcessusAchatMetier{

	@PersistenceContext
	EntityManager entityManager;
	
	public Utilisateur authentification(String login, String password) {
		Query query = entityManager.createQuery("from Utilisateur where mail=:login && password=:mdp");
		query.setParameter("login", login);
		query.setParameter("mdp", password);
		
		return (Utilisateur)query.getSingleResult();
	}

	public String obtenirProfil(String login) {
		Query query =null;
		String role=null;
		
		Utilisateur u = entityManager.find(Utilisateur.class,obtenirIdUtilisateur(login));
		if (null==u) {
			throw new RuntimeException("il n'a pas d'utilisateur avec cet identifiant en base");
		}else{
			u.getProfil().getIdProfil();
			query = entityManager.createQuery("select libelle from Profil p  where p.idProfil =(select u.profil.idProfil from Utilisateur u where mail LIKE :mail)");
			query.setParameter("mail", login);
			role = (String)query.getSingleResult();
		}
		return role;
	}

	public int obtenirIdUtilisateur(String login) {
		Query query = entityManager.createQuery
		("select idUtilisateur from Utilisateur where mail=:mail");
		query.setParameter("mail", login);
		return (int)query.getSingleResult();
	}

	public Commande ajouterCommande(int idUtilisateur, String nomFournisseur) {

		Commande cmde=null;
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

		Commande commande = new Commande();
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, idUtilisateur);
		
		if (null!= nomFournisseur && null!= utilisateur) {
			commande.setDateCommande(date);
			commande.setFournisseur(nomFournisseur);
			commande.setUtilisateur(utilisateur);
			entityManager.persist(commande);
			cmde = commande;
		}else
			new RuntimeException("utilisateur introuvable");
		return cmde;
	}

	public void ajouterLivraison(String dateLivraison, String livre, int idCommande, int idUtilisateur) {
	    
		LocalDate date = LocalDate.parse(dateLivraison);

		Commande commande = entityManager.find(Commande.class, idCommande);
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, idUtilisateur);
		
		//vérifier si la commande est dejà bien dans la table livraison si oui faire un update
		Query query =entityManager.createQuery("from Livraison l where l.commande.idCommande =:idComm ");
		query.setParameter("idComm", idCommande);
		
		Livraison livraisonUpdate = null;
		try{
			livraisonUpdate = (Livraison)query.getSingleResult();
		}
		catch (NoResultException nre){
		//Ignore this because as per your logic this is ok!
		}

		if (livraisonUpdate == null) {
			Livraison livraison = new Livraison();
			
			if (null!=commande && null!=utilisateur) {
				livraison.setDateLivraison(java.sql.Date.valueOf(date));
				livraison.setLivre(livre);
				livraison.setCommande(commande);
				livraison.setUtilisateur(utilisateur);
				entityManager.persist(livraison);
			}else
				new RuntimeException("commande ou utilisateur introuvable");
		}else{
			 livraisonUpdate = (Livraison) query.getSingleResult();

			updateLivraison(livraisonUpdate.getIdLivraison(),java.sql.Date.valueOf(date), livre, idUtilisateur, idCommande);
		}
		
	}
	
public void ajouterFacture(String datePaye, String paye, int idCommande, int idUtilisateur) {
	    
		LocalDate date = LocalDate.parse(datePaye);

		Commande commande = entityManager.find(Commande.class, idCommande);
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, idUtilisateur);
		
		//vérifier si la commande est dejà bien dans la table facture si oui faire un update
		Query query =entityManager.createQuery("from Facture l where l.commande.idCommande =:idComm ");
		query.setParameter("idComm", idCommande);
		
		Facture factureUpdate = null;
		try{
			factureUpdate = (Facture)query.getSingleResult();
		}
		catch (NoResultException nre){
		//Ignore this because as per your logic this is ok!
		}

		if (factureUpdate == null) {
			Facture facture = new Facture();
			
			if (null!=commande && null!=utilisateur) {
				facture.setDateFacture(java.sql.Date.valueOf(date));
				facture.setPaye(paye);
				facture.setCommande(commande);
				facture.setUtilisateur(utilisateur);
				entityManager.persist(facture);
			}else
				new RuntimeException("commande ou utilisateur introuvable");
		}else{
			factureUpdate = (Facture) query.getSingleResult();

			updateFacture(factureUpdate.getIdFacture(),java.sql.Date.valueOf(date), paye, idUtilisateur, idCommande);
		}
		
	}

	
	public void ajouterLigneCommande(LigneCommande ligneCommande) {

			if (null != ligneCommande && ligneCommande.getCommande()!=null) {
				entityManager.persist(ligneCommande);
			}else
				new RuntimeException("commande  introuvable");
		
	}

	public void supprimerLigneCommande(int idLignCom) {

		LigneCommande ligneCommande = entityManager.find(LigneCommande.class, idLignCom);
		entityManager.remove(ligneCommande);
		
	}

	public List<Commande> getAllCommandeNonLivre() {
		String statut = "non";
		List<Commande>listCommandes = new ArrayList<Commande>();
		Query query = entityManager.createQuery("from Commande where idCommande not in(select l.commande.idCommande from Livraison l) OR idCommande in(select l.commande.idCommande from Livraison l where livre=:livree)");
		query.setParameter("livree",statut );
		listCommandes = query.getResultList();
		return listCommandes;
	}

	public List<Commande> getAllCommandeLivreNonPaye() {
		List<Commande>listCommandes = new ArrayList<Commande>();
		String statutPayee = "non";
		String statutLivree= "oui";

		Query query = entityManager.createQuery("from Commande where idCommande in (select l.commande.idCommande FROM Livraison l WHERE livre=:livree) AND ( idCommande not in(select f.commande.idCommande from Facture f) OR idCommande in(select f.commande.idCommande from Facture f where paye=:payee) )");
				query.setParameter("payee", statutPayee);
				query.setParameter("livree", statutLivree);
				listCommandes = query.getResultList();
				return listCommandes;
	}

	public List<Livraison> getAllLivraison() {
		Query query = entityManager.createQuery("from livraison");
		return query.getResultList();
	}

	public List<Facture> getAllFacture() {
		Query query = entityManager.createQuery("from facture");
		return query.getResultList();
	}

	public Commande getCommande(int idCommande) {

		Query query = entityManager.createQuery("from commande where id_commande =:idCommande");
		query.setParameter("idCommande", idCommande);
		
		return (Commande)query.getSingleResult();
	}

	public Livraison getLivraison(int idLivraison) {
		Query query = entityManager.createQuery("from livraison where id_livraison =:idLivraison");
		query.setParameter("idLivraison", idLivraison);
		
		return (Livraison)query.getSingleResult();
	}

	public Facture getFacture(int idFacture) {
		Query query = entityManager.createQuery("from facture where id_facture =:idFacture");
		query.setParameter("idFacture", idFacture);
		return (Facture)query.getSingleResult();
	}

	public void updateLivraison(int idLivraison, Date dateLivraison, String livre, int idUtilisateur, int idCommande) {

		Commande commande = entityManager.find(Commande.class, idCommande);
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, idUtilisateur);
		Livraison livraison = entityManager.find(Livraison.class, idLivraison);
		
		if (null!=commande && null!=utilisateur && livraison!=null) {
			livraison.setDateLivraison(dateLivraison);
			livraison.setLivre(livre);
			livraison.setCommande(commande);
			livraison.setUtilisateur(utilisateur);
			entityManager.merge(livraison);
		}
	}

	public void updateFacture(int idFacture, Date dateFacture, String paye, int idUtilisateur, int idCommande) {

		Commande commande = entityManager.find(Commande.class, idCommande);
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, idUtilisateur);
		Facture facture = entityManager.find(Facture.class, idFacture);
		
		if (null!=commande && null!=utilisateur && facture!=null) {
			facture.setDateFacture(dateFacture);
			facture.setPaye(paye);
			facture.setCommande(commande);
			facture.setUtilisateur(utilisateur);
			entityManager.merge(facture);
		}
	}

}
