package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the livraison database table.
 * 
 */
@Entity
@NamedQuery(name="Livraison.findAll", query="SELECT l FROM Livraison l")
public class Livraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_livraison")
	private int idLivraison;

	@Temporal(TemporalType.DATE)
	@Column(name="date_livraison")
	private Date dateLivraison;

	private String livre;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="id_commande")
	private Commande commande;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;

	public Livraison() {
	}

	public int getIdLivraison() {
		return this.idLivraison;
	}

	public void setIdLivraison(int idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public String getLivre() {
		return this.livre;
	}

	public void setLivre(String livre) {
		this.livre = livre;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}