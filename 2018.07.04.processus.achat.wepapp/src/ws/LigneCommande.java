
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ligneCommande complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ligneCommande"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commande" type="{http://ws/}commande" minOccurs="0"/&gt;
 *         &lt;element name="idLignCom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perissable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="qte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ligneCommande", propOrder = {
    "commande",
    "idLignCom",
    "libelle",
    "perissable",
    "prix",
    "qte"
})
public class LigneCommande {

    protected Commande commande;
    protected int idLignCom;
    protected String libelle;
    protected String perissable;
    protected double prix;
    protected int qte;

    public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
    public LigneCommande(String libelle, int qte, Double prix,String perissable) {
    	this.libelle=libelle;
    	this.qte=qte;
    	this.prix=prix;
		this.perissable = perissable;

	}

	/**
     * Obtient la valeur de la propriété commande.
     * 
     * @return
     *     possible object is
     *     {@link Commande }
     *     
     */
    public Commande getCommande() {
        return commande;
    }

    /**
     * Définit la valeur de la propriété commande.
     * 
     * @param value
     *     allowed object is
     *     {@link Commande }
     *     
     */
    public void setCommande(Commande value) {
        this.commande = value;
    }

    /**
     * Obtient la valeur de la propriété idLignCom.
     * 
     */
    public int getIdLignCom() {
        return idLignCom;
    }

    /**
     * Définit la valeur de la propriété idLignCom.
     * 
     */
    public void setIdLignCom(int value) {
        this.idLignCom = value;
    }

    /**
     * Obtient la valeur de la propriété libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit la valeur de la propriété libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propriété perissable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerissable() {
        return perissable;
    }

    /**
     * Définit la valeur de la propriété perissable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerissable(String value) {
        this.perissable = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété qte.
     * 
     */
    public int getQte() {
        return qte;
    }

    /**
     * Définit la valeur de la propriété qte.
     * 
     */
    public void setQte(int value) {
        this.qte = value;
    }

}
