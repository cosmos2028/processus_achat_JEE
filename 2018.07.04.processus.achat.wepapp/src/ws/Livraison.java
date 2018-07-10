
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour livraison complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="livraison"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commande" type="{http://ws/}commande" minOccurs="0"/&gt;
 *         &lt;element name="dateLivraison" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idLivraison" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="livre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilisateur" type="{http://ws/}utilisateur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livraison", propOrder = {
    "commande",
    "dateLivraison",
    "idLivraison",
    "livre",
    "utilisateur"
})
public class Livraison {

    protected Commande commande;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLivraison;
    protected int idLivraison;
    protected String livre;
    protected Utilisateur utilisateur;

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
     * Obtient la valeur de la propriété dateLivraison.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLivraison() {
        return dateLivraison;
    }

    /**
     * Définit la valeur de la propriété dateLivraison.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLivraison(XMLGregorianCalendar value) {
        this.dateLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété idLivraison.
     * 
     */
    public int getIdLivraison() {
        return idLivraison;
    }

    /**
     * Définit la valeur de la propriété idLivraison.
     * 
     */
    public void setIdLivraison(int value) {
        this.idLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété livre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivre() {
        return livre;
    }

    /**
     * Définit la valeur de la propriété livre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivre(String value) {
        this.livre = value;
    }

    /**
     * Obtient la valeur de la propriété utilisateur.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Définit la valeur de la propriété utilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setUtilisateur(Utilisateur value) {
        this.utilisateur = value;
    }

}
