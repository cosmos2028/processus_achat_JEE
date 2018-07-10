package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ligne_commandes database table.
 * 
 */
@Entity
@Table(name="ligne_commandes")
@NamedQuery(name="LigneCommande.findAll", query="SELECT l FROM LigneCommande l")
public class LigneCommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_lign_com")
	private int idLignCom;

	private String libelle;

	private double prix;

	private int qte;
	private String perissable;
	
	

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="id_commande")
	private Commande commande;

	public LigneCommande() {
	}

	public int getIdLignCom() {
		return this.idLignCom;
	}

	public void setIdLignCom(int idLignCom) {
		this.idLignCom = idLignCom;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getPerissable() {
		return perissable;
	}

	public void setPerissable(String perissable) {
		this.perissable = perissable;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return this.qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}