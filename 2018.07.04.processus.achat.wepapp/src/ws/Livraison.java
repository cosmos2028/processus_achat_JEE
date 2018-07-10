
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour livraison complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� commande.
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
     * D�finit la valeur de la propri�t� commande.
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
     * Obtient la valeur de la propri�t� dateLivraison.
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
     * D�finit la valeur de la propri�t� dateLivraison.
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
     * Obtient la valeur de la propri�t� idLivraison.
     * 
     */
    public int getIdLivraison() {
        return idLivraison;
    }

    /**
     * D�finit la valeur de la propri�t� idLivraison.
     * 
     */
    public void setIdLivraison(int value) {
        this.idLivraison = value;
    }

    /**
     * Obtient la valeur de la propri�t� livre.
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
     * D�finit la valeur de la propri�t� livre.
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
     * Obtient la valeur de la propri�t� utilisateur.
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
     * D�finit la valeur de la propri�t� utilisateur.
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
