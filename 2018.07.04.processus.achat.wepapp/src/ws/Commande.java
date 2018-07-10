
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour commande complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commande"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateCommande" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fournisseur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCommande" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commande", propOrder = {
    "dateCommande",
    "fournisseur",
    "idCommande"
})
public class Commande {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCommande;
    protected String fournisseur;
    protected int idCommande;

    /**
     * Obtient la valeur de la propriété dateCommande.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCommande() {
        return dateCommande;
    }

    /**
     * Définit la valeur de la propriété dateCommande.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCommande(XMLGregorianCalendar value) {
        this.dateCommande = value;
    }

    /**
     * Obtient la valeur de la propriété fournisseur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFournisseur() {
        return fournisseur;
    }

    /**
     * Définit la valeur de la propriété fournisseur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFournisseur(String value) {
        this.fournisseur = value;
    }

    /**
     * Obtient la valeur de la propriété idCommande.
     * 
     */
    public int getIdCommande() {
        return idCommande;
    }

    /**
     * Définit la valeur de la propriété idCommande.
     * 
     */
    public void setIdCommande(int value) {
        this.idCommande = value;
    }

}
