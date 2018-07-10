package entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")

public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_commande")
	private int idCommande;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_commande")
	private Date dateCommande;

	private String fournisseur;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Facture
	@OneToMany(mappedBy="commande", fetch=FetchType.EAGER)
	private Set<Facture> factures;

	//bi-directional many-to-one association to LigneCommande
	@OneToMany(mappedBy="commande", fetch=FetchType.EAGER)
	private Set<LigneCommande> ligneCommandes;

	//bi-directional many-to-one association to Livraison
	@OneToMany(mappedBy="commande", fetch=FetchType.EAGER)
	private Set<Livraison> livraisons;

	public Commande() {
	}
	public int getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	@XmlTransient
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@XmlTransient
	public Set<Facture> getFactures() {
		return this.factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	public Facture addFacture(Facture facture) {
		getFactures().add(facture);
		facture.setCommande(this);

		return facture;
	}

	public Facture removeFacture(Facture facture) {
		getFactures().remove(facture);
		facture.setCommande(null);

		return facture;
	}
	@XmlTransient
	public Set<LigneCommande> getLigneCommandes() {
		return this.ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public LigneCommande addLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().add(ligneCommande);
		ligneCommande.setCommande(this);

		return ligneCommande;
	}

	public LigneCommande removeLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().remove(ligneCommande);
		ligneCommande.setCommande(null);

		return ligneCommande;
	}
	@XmlTransient
	public Set<Livraison> getLivraisons() {
		return this.livraisons;
	}

	public void setLivraisons(Set<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	public Livraison addLivraison(Livraison livraison) {
		getLivraisons().add(livraison);
		livraison.setCommande(this);

		return livraison;
	}

	public Livraison removeLivraison(Livraison livraison) {
		getLivraisons().remove(livraison);
		livraison.setCommande(null);

		return livraison;
	}

}