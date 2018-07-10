
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour facture complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="facture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commande" type="{http://ws/}commande" minOccurs="0"/&gt;
 *         &lt;element name="dateFacture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idFacture" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "facture", propOrder = {
    "commande",
    "dateFacture",
    "idFacture",
    "paye",
    "utilisateur"
})
public class Facture {

    protected Commande commande;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFacture;
    protected int idFacture;
    protected String paye;
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
     * Obtient la valeur de la propriété dateFacture.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFacture() {
        return dateFacture;
    }

    /**
     * Définit la valeur de la propriété dateFacture.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFacture(XMLGregorianCalendar value) {
        this.dateFacture = value;
    }

    /**
     * Obtient la valeur de la propriété idFacture.
     * 
     */
    public int getIdFacture() {
        return idFacture;
    }

    /**
     * Définit la valeur de la propriété idFacture.
     * 
     */
    public void setIdFacture(int value) {
        this.idFacture = value;
    }

    /**
     * Obtient la valeur de la propriété paye.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaye() {
        return paye;
    }

    /**
     * Définit la valeur de la propriété paye.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaye(String value) {
        this.paye = value;
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
