
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour profil complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="profil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idProfil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilisateurs" type="{http://ws/}utilisateur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profil", propOrder = {
    "idProfil",
    "libelle",
    "utilisateurs"
})
public class Profil {

    protected int idProfil;
    protected String libelle;
    @XmlElement(nillable = true)
    protected List<Utilisateur> utilisateurs;

    /**
     * Obtient la valeur de la propriété idProfil.
     * 
     */
    public int getIdProfil() {
        return idProfil;
    }

    /**
     * Définit la valeur de la propriété idProfil.
     * 
     */
    public void setIdProfil(int value) {
        this.idProfil = value;
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
     * Gets the value of the utilisateurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilisateurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilisateurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Utilisateur }
     * 
     * 
     */
    public List<Utilisateur> getUtilisateurs() {
        if (utilisateurs == null) {
            utilisateurs = new ArrayList<Utilisateur>();
        }
        return this.utilisateurs;
    }

}
