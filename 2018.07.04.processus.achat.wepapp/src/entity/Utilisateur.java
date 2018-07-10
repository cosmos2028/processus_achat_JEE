package entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.Set;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
@XmlRootElement
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utilisateur")
	private int idUtilisateur;

	private String adresse;

	@Column(name="code_postal")
	private int codePostal;

	@Column(name="date_naiss")
	private String dateNaiss;

	private String mail;

	private String nom;

	private String password;

	private String prenom;

	private String sexe;

	private String telephone;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	private Set<Commande> commandes;

	//bi-directional many-to-one association to Facture
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	private Set<Facture> factures;

	//bi-directional many-to-one association to Livraison
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	private Set<Livraison> livraisons;

	//bi-directional many-to-one association to Profil
	@ManyToOne
	@JoinColumn(name="id_profil")
	private Profil profil;

	public Utilisateur() {
	}

	@XmlTransient
	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	@XmlTransient
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@XmlTransient
	public int getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	@XmlTransient
	public String getDateNaiss() {
		return this.dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	@XmlTransient
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@XmlTransient
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@XmlTransient
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@XmlTransient
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@XmlTransient
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	@XmlTransient
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@XmlTransient
	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setUtilisateur(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setUtilisateur(null);

		return commande;
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
		facture.setUtilisateur(this);

		return facture;
	}

	public Facture removeFacture(Facture facture) {
		getFactures().remove(facture);
		facture.setUtilisateur(null);

		return facture;
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
		livraison.setUtilisateur(this);

		return livraison;
	}

	public Livraison removeLivraison(Livraison livraison) {
		getLivraisons().remove(livraison);
		livraison.setUtilisateur(null);

		return livraison;
	}
	@XmlTransient
	public Profil getProfil() {
		return this.profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

}