
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterCommande_QNAME = new QName("http://ws/", "ajouterCommande");
    private final static QName _AjouterCommandeResponse_QNAME = new QName("http://ws/", "ajouterCommandeResponse");
    private final static QName _AjouterFacture_QNAME = new QName("http://ws/", "ajouterFacture");
    private final static QName _AjouterFactureResponse_QNAME = new QName("http://ws/", "ajouterFactureResponse");
    private final static QName _AjouterLigneCommande_QNAME = new QName("http://ws/", "ajouterLigneCommande");
    private final static QName _AjouterLigneCommandeResponse_QNAME = new QName("http://ws/", "ajouterLigneCommandeResponse");
    private final static QName _AjouterLivraison_QNAME = new QName("http://ws/", "ajouterLivraison");
    private final static QName _AjouterLivraisonResponse_QNAME = new QName("http://ws/", "ajouterLivraisonResponse");
    private final static QName _Authentification_QNAME = new QName("http://ws/", "authentification");
    private final static QName _AuthentificationResponse_QNAME = new QName("http://ws/", "authentificationResponse");
    private final static QName _GetAllCommandeLivreNonPaye_QNAME = new QName("http://ws/", "getAllCommandeLivreNonPaye");
    private final static QName _GetAllCommandeLivreNonPayeResponse_QNAME = new QName("http://ws/", "getAllCommandeLivreNonPayeResponse");
    private final static QName _GetAllCommandeNonLivre_QNAME = new QName("http://ws/", "getAllCommandeNonLivre");
    private final static QName _GetAllCommandeNonLivreResponse_QNAME = new QName("http://ws/", "getAllCommandeNonLivreResponse");
    private final static QName _GetAllFacture_QNAME = new QName("http://ws/", "getAllFacture");
    private final static QName _GetAllFactureResponse_QNAME = new QName("http://ws/", "getAllFactureResponse");
    private final static QName _GetAllLivraison_QNAME = new QName("http://ws/", "getAllLivraison");
    private final static QName _GetAllLivraisonResponse_QNAME = new QName("http://ws/", "getAllLivraisonResponse");
    private final static QName _GetCommande_QNAME = new QName("http://ws/", "getCommande");
    private final static QName _GetCommandeResponse_QNAME = new QName("http://ws/", "getCommandeResponse");
    private final static QName _GetFacture_QNAME = new QName("http://ws/", "getFacture");
    private final static QName _GetFactureResponse_QNAME = new QName("http://ws/", "getFactureResponse");
    private final static QName _GetLivraison_QNAME = new QName("http://ws/", "getLivraison");
    private final static QName _GetLivraisonResponse_QNAME = new QName("http://ws/", "getLivraisonResponse");
    private final static QName _ObtenirIdUtilisateur_QNAME = new QName("http://ws/", "obtenirIdUtilisateur");
    private final static QName _ObtenirIdUtilisateurResponse_QNAME = new QName("http://ws/", "obtenirIdUtilisateurResponse");
    private final static QName _ObtenirProfil_QNAME = new QName("http://ws/", "obtenirProfil");
    private final static QName _ObtenirProfilResponse_QNAME = new QName("http://ws/", "obtenirProfilResponse");
    private final static QName _SupprimerLigneCommande_QNAME = new QName("http://ws/", "supprimerLigneCommande");
    private final static QName _SupprimerLigneCommandeResponse_QNAME = new QName("http://ws/", "supprimerLigneCommandeResponse");
    private final static QName _UpdateFacture_QNAME = new QName("http://ws/", "updateFacture");
    private final static QName _UpdateFactureResponse_QNAME = new QName("http://ws/", "updateFactureResponse");
    private final static QName _UpdateLivraison_QNAME = new QName("http://ws/", "updateLivraison");
    private final static QName _UpdateLivraisonResponse_QNAME = new QName("http://ws/", "updateLivraisonResponse");
    private final static QName _Utilisateur_QNAME = new QName("http://ws/", "utilisateur");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterCommande }
     * 
     */
    public AjouterCommande createAjouterCommande() {
        return new AjouterCommande();
    }

    /**
     * Create an instance of {@link AjouterCommandeResponse }
     * 
     */
    public AjouterCommandeResponse createAjouterCommandeResponse() {
        return new AjouterCommandeResponse();
    }

    /**
     * Create an instance of {@link AjouterFacture }
     * 
     */
    public AjouterFacture createAjouterFacture() {
        return new AjouterFacture();
    }

    /**
     * Create an instance of {@link AjouterFactureResponse }
     * 
     */
    public AjouterFactureResponse createAjouterFactureResponse() {
        return new AjouterFactureResponse();
    }

    /**
     * Create an instance of {@link AjouterLigneCommande }
     * 
     */
    public AjouterLigneCommande createAjouterLigneCommande() {
        return new AjouterLigneCommande();
    }

    /**
     * Create an instance of {@link AjouterLigneCommandeResponse }
     * 
     */
    public AjouterLigneCommandeResponse createAjouterLigneCommandeResponse() {
        return new AjouterLigneCommandeResponse();
    }

    /**
     * Create an instance of {@link AjouterLivraison }
     * 
     */
    public AjouterLivraison createAjouterLivraison() {
        return new AjouterLivraison();
    }

    /**
     * Create an instance of {@link AjouterLivraisonResponse }
     * 
     */
    public AjouterLivraisonResponse createAjouterLivraisonResponse() {
        return new AjouterLivraisonResponse();
    }

    /**
     * Create an instance of {@link Authentification }
     * 
     */
    public Authentification createAuthentification() {
        return new Authentification();
    }

    /**
     * Create an instance of {@link AuthentificationResponse }
     * 
     */
    public AuthentificationResponse createAuthentificationResponse() {
        return new AuthentificationResponse();
    }

    /**
     * Create an instance of {@link GetAllCommandeLivreNonPaye }
     * 
     */
    public GetAllCommandeLivreNonPaye createGetAllCommandeLivreNonPaye() {
        return new GetAllCommandeLivreNonPaye();
    }

    /**
     * Create an instance of {@link GetAllCommandeLivreNonPayeResponse }
     * 
     */
    public GetAllCommandeLivreNonPayeResponse createGetAllCommandeLivreNonPayeResponse() {
        return new GetAllCommandeLivreNonPayeResponse();
    }

    /**
     * Create an instance of {@link GetAllCommandeNonLivre }
     * 
     */
    public GetAllCommandeNonLivre createGetAllCommandeNonLivre() {
        return new GetAllCommandeNonLivre();
    }

    /**
     * Create an instance of {@link GetAllCommandeNonLivreResponse }
     * 
     */
    public GetAllCommandeNonLivreResponse createGetAllCommandeNonLivreResponse() {
        return new GetAllCommandeNonLivreResponse();
    }

    /**
     * Create an instance of {@link GetAllFacture }
     * 
     */
    public GetAllFacture createGetAllFacture() {
        return new GetAllFacture();
    }

    /**
     * Create an instance of {@link GetAllFactureResponse }
     * 
     */
    public GetAllFactureResponse createGetAllFactureResponse() {
        return new GetAllFactureResponse();
    }

    /**
     * Create an instance of {@link GetAllLivraison }
     * 
     */
    public GetAllLivraison createGetAllLivraison() {
        return new GetAllLivraison();
    }

    /**
     * Create an instance of {@link GetAllLivraisonResponse }
     * 
     */
    public GetAllLivraisonResponse createGetAllLivraisonResponse() {
        return new GetAllLivraisonResponse();
    }

    /**
     * Create an instance of {@link GetCommande }
     * 
     */
    public GetCommande createGetCommande() {
        return new GetCommande();
    }

    /**
     * Create an instance of {@link GetCommandeResponse }
     * 
     */
    public GetCommandeResponse createGetCommandeResponse() {
        return new GetCommandeResponse();
    }

    /**
     * Create an instance of {@link GetFacture }
     * 
     */
    public GetFacture createGetFacture() {
        return new GetFacture();
    }

    /**
     * Create an instance of {@link GetFactureResponse }
     * 
     */
    public GetFactureResponse createGetFactureResponse() {
        return new GetFactureResponse();
    }

    /**
     * Create an instance of {@link GetLivraison }
     * 
     */
    public GetLivraison createGetLivraison() {
        return new GetLivraison();
    }

    /**
     * Create an instance of {@link GetLivraisonResponse }
     * 
     */
    public GetLivraisonResponse createGetLivraisonResponse() {
        return new GetLivraisonResponse();
    }

    /**
     * Create an instance of {@link ObtenirIdUtilisateur }
     * 
     */
    public ObtenirIdUtilisateur createObtenirIdUtilisateur() {
        return new ObtenirIdUtilisateur();
    }

    /**
     * Create an instance of {@link ObtenirIdUtilisateurResponse }
     * 
     */
    public ObtenirIdUtilisateurResponse createObtenirIdUtilisateurResponse() {
        return new ObtenirIdUtilisateurResponse();
    }

    /**
     * Create an instance of {@link ObtenirProfil }
     * 
     */
    public ObtenirProfil createObtenirProfil() {
        return new ObtenirProfil();
    }

    /**
     * Create an instance of {@link ObtenirProfilResponse }
     * 
     */
    public ObtenirProfilResponse createObtenirProfilResponse() {
        return new ObtenirProfilResponse();
    }

    /**
     * Create an instance of {@link SupprimerLigneCommande }
     * 
     */
    public SupprimerLigneCommande createSupprimerLigneCommande() {
        return new SupprimerLigneCommande();
    }

    /**
     * Create an instance of {@link SupprimerLigneCommandeResponse }
     * 
     */
    public SupprimerLigneCommandeResponse createSupprimerLigneCommandeResponse() {
        return new SupprimerLigneCommandeResponse();
    }

    /**
     * Create an instance of {@link UpdateFacture }
     * 
     */
    public UpdateFacture createUpdateFacture() {
        return new UpdateFacture();
    }

    /**
     * Create an instance of {@link UpdateFactureResponse }
     * 
     */
    public UpdateFactureResponse createUpdateFactureResponse() {
        return new UpdateFactureResponse();
    }

    /**
     * Create an instance of {@link UpdateLivraison }
     * 
     */
    public UpdateLivraison createUpdateLivraison() {
        return new UpdateLivraison();
    }

    /**
     * Create an instance of {@link UpdateLivraisonResponse }
     * 
     */
    public UpdateLivraisonResponse createUpdateLivraisonResponse() {
        return new UpdateLivraisonResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link Commande }
     * 
     */
    public Commande createCommande() {
        return new Commande();
    }

    /**
     * Create an instance of {@link Facture }
     * 
     */
    public Facture createFacture() {
        return new Facture();
    }

    /**
     * Create an instance of {@link Livraison }
     * 
     */
    public Livraison createLivraison() {
        return new Livraison();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link LigneCommande }
     * 
     */
    public LigneCommande createLigneCommande() {
        return new LigneCommande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterCommande")
    public JAXBElement<AjouterCommande> createAjouterCommande(AjouterCommande value) {
        return new JAXBElement<AjouterCommande>(_AjouterCommande_QNAME, AjouterCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterCommandeResponse")
    public JAXBElement<AjouterCommandeResponse> createAjouterCommandeResponse(AjouterCommandeResponse value) {
        return new JAXBElement<AjouterCommandeResponse>(_AjouterCommandeResponse_QNAME, AjouterCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterFacture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterFacture")
    public JAXBElement<AjouterFacture> createAjouterFacture(AjouterFacture value) {
        return new JAXBElement<AjouterFacture>(_AjouterFacture_QNAME, AjouterFacture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterFactureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterFactureResponse")
    public JAXBElement<AjouterFactureResponse> createAjouterFactureResponse(AjouterFactureResponse value) {
        return new JAXBElement<AjouterFactureResponse>(_AjouterFactureResponse_QNAME, AjouterFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLigneCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterLigneCommande")
    public JAXBElement<AjouterLigneCommande> createAjouterLigneCommande(AjouterLigneCommande value) {
        return new JAXBElement<AjouterLigneCommande>(_AjouterLigneCommande_QNAME, AjouterLigneCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLigneCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterLigneCommandeResponse")
    public JAXBElement<AjouterLigneCommandeResponse> createAjouterLigneCommandeResponse(AjouterLigneCommandeResponse value) {
        return new JAXBElement<AjouterLigneCommandeResponse>(_AjouterLigneCommandeResponse_QNAME, AjouterLigneCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivraison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterLivraison")
    public JAXBElement<AjouterLivraison> createAjouterLivraison(AjouterLivraison value) {
        return new JAXBElement<AjouterLivraison>(_AjouterLivraison_QNAME, AjouterLivraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivraisonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterLivraisonResponse")
    public JAXBElement<AjouterLivraisonResponse> createAjouterLivraisonResponse(AjouterLivraisonResponse value) {
        return new JAXBElement<AjouterLivraisonResponse>(_AjouterLivraisonResponse_QNAME, AjouterLivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "authentification")
    public JAXBElement<Authentification> createAuthentification(Authentification value) {
        return new JAXBElement<Authentification>(_Authentification_QNAME, Authentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "authentificationResponse")
    public JAXBElement<AuthentificationResponse> createAuthentificationResponse(AuthentificationResponse value) {
        return new JAXBElement<AuthentificationResponse>(_AuthentificationResponse_QNAME, AuthentificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCommandeLivreNonPaye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCommandeLivreNonPaye")
    public JAXBElement<GetAllCommandeLivreNonPaye> createGetAllCommandeLivreNonPaye(GetAllCommandeLivreNonPaye value) {
        return new JAXBElement<GetAllCommandeLivreNonPaye>(_GetAllCommandeLivreNonPaye_QNAME, GetAllCommandeLivreNonPaye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCommandeLivreNonPayeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCommandeLivreNonPayeResponse")
    public JAXBElement<GetAllCommandeLivreNonPayeResponse> createGetAllCommandeLivreNonPayeResponse(GetAllCommandeLivreNonPayeResponse value) {
        return new JAXBElement<GetAllCommandeLivreNonPayeResponse>(_GetAllCommandeLivreNonPayeResponse_QNAME, GetAllCommandeLivreNonPayeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCommandeNonLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCommandeNonLivre")
    public JAXBElement<GetAllCommandeNonLivre> createGetAllCommandeNonLivre(GetAllCommandeNonLivre value) {
        return new JAXBElement<GetAllCommandeNonLivre>(_GetAllCommandeNonLivre_QNAME, GetAllCommandeNonLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCommandeNonLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllCommandeNonLivreResponse")
    public JAXBElement<GetAllCommandeNonLivreResponse> createGetAllCommandeNonLivreResponse(GetAllCommandeNonLivreResponse value) {
        return new JAXBElement<GetAllCommandeNonLivreResponse>(_GetAllCommandeNonLivreResponse_QNAME, GetAllCommandeNonLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFacture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllFacture")
    public JAXBElement<GetAllFacture> createGetAllFacture(GetAllFacture value) {
        return new JAXBElement<GetAllFacture>(_GetAllFacture_QNAME, GetAllFacture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFactureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllFactureResponse")
    public JAXBElement<GetAllFactureResponse> createGetAllFactureResponse(GetAllFactureResponse value) {
        return new JAXBElement<GetAllFactureResponse>(_GetAllFactureResponse_QNAME, GetAllFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLivraison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllLivraison")
    public JAXBElement<GetAllLivraison> createGetAllLivraison(GetAllLivraison value) {
        return new JAXBElement<GetAllLivraison>(_GetAllLivraison_QNAME, GetAllLivraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLivraisonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllLivraisonResponse")
    public JAXBElement<GetAllLivraisonResponse> createGetAllLivraisonResponse(GetAllLivraisonResponse value) {
        return new JAXBElement<GetAllLivraisonResponse>(_GetAllLivraisonResponse_QNAME, GetAllLivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCommande")
    public JAXBElement<GetCommande> createGetCommande(GetCommande value) {
        return new JAXBElement<GetCommande>(_GetCommande_QNAME, GetCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCommandeResponse")
    public JAXBElement<GetCommandeResponse> createGetCommandeResponse(GetCommandeResponse value) {
        return new JAXBElement<GetCommandeResponse>(_GetCommandeResponse_QNAME, GetCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFacture")
    public JAXBElement<GetFacture> createGetFacture(GetFacture value) {
        return new JAXBElement<GetFacture>(_GetFacture_QNAME, GetFacture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFactureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFactureResponse")
    public JAXBElement<GetFactureResponse> createGetFactureResponse(GetFactureResponse value) {
        return new JAXBElement<GetFactureResponse>(_GetFactureResponse_QNAME, GetFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivraison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLivraison")
    public JAXBElement<GetLivraison> createGetLivraison(GetLivraison value) {
        return new JAXBElement<GetLivraison>(_GetLivraison_QNAME, GetLivraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivraisonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getLivraisonResponse")
    public JAXBElement<GetLivraisonResponse> createGetLivraisonResponse(GetLivraisonResponse value) {
        return new JAXBElement<GetLivraisonResponse>(_GetLivraisonResponse_QNAME, GetLivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirIdUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenirIdUtilisateur")
    public JAXBElement<ObtenirIdUtilisateur> createObtenirIdUtilisateur(ObtenirIdUtilisateur value) {
        return new JAXBElement<ObtenirIdUtilisateur>(_ObtenirIdUtilisateur_QNAME, ObtenirIdUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirIdUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenirIdUtilisateurResponse")
    public JAXBElement<ObtenirIdUtilisateurResponse> createObtenirIdUtilisateurResponse(ObtenirIdUtilisateurResponse value) {
        return new JAXBElement<ObtenirIdUtilisateurResponse>(_ObtenirIdUtilisateurResponse_QNAME, ObtenirIdUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirProfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenirProfil")
    public JAXBElement<ObtenirProfil> createObtenirProfil(ObtenirProfil value) {
        return new JAXBElement<ObtenirProfil>(_ObtenirProfil_QNAME, ObtenirProfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirProfilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenirProfilResponse")
    public JAXBElement<ObtenirProfilResponse> createObtenirProfilResponse(ObtenirProfilResponse value) {
        return new JAXBElement<ObtenirProfilResponse>(_ObtenirProfilResponse_QNAME, ObtenirProfilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerLigneCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerLigneCommande")
    public JAXBElement<SupprimerLigneCommande> createSupprimerLigneCommande(SupprimerLigneCommande value) {
        return new JAXBElement<SupprimerLigneCommande>(_SupprimerLigneCommande_QNAME, SupprimerLigneCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerLigneCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerLigneCommandeResponse")
    public JAXBElement<SupprimerLigneCommandeResponse> createSupprimerLigneCommandeResponse(SupprimerLigneCommandeResponse value) {
        return new JAXBElement<SupprimerLigneCommandeResponse>(_SupprimerLigneCommandeResponse_QNAME, SupprimerLigneCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFacture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateFacture")
    public JAXBElement<UpdateFacture> createUpdateFacture(UpdateFacture value) {
        return new JAXBElement<UpdateFacture>(_UpdateFacture_QNAME, UpdateFacture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFactureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateFactureResponse")
    public JAXBElement<UpdateFactureResponse> createUpdateFactureResponse(UpdateFactureResponse value) {
        return new JAXBElement<UpdateFactureResponse>(_UpdateFactureResponse_QNAME, UpdateFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivraison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateLivraison")
    public JAXBElement<UpdateLivraison> createUpdateLivraison(UpdateLivraison value) {
        return new JAXBElement<UpdateLivraison>(_UpdateLivraison_QNAME, UpdateLivraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLivraisonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateLivraisonResponse")
    public JAXBElement<UpdateLivraisonResponse> createUpdateLivraisonResponse(UpdateLivraisonResponse value) {
        return new JAXBElement<UpdateLivraisonResponse>(_UpdateLivraisonResponse_QNAME, UpdateLivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Utilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "utilisateur")
    public JAXBElement<Utilisateur> createUtilisateur(Utilisateur value) {
        return new JAXBElement<Utilisateur>(_Utilisateur_QNAME, Utilisateur.class, null, value);
    }

}
