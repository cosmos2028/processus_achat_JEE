package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.FactureModel;
import model.LivraisonModel;
import ws.LigneCommande;
import ws.ProcessusAchatMetier;
import ws.ProcessusAchatMetierService;

//@WebServlet("/MaServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<LigneCommande> lesLignes;
	HttpServletRequest request = null;
	HttpServletResponse response = null;
	HttpSession session = null;
	String login;
	String password;
	int positionDernierSlash, positionDernierPoint;
	String action = "aucune", vue = null, droit = null;
	ProcessusAchatMetier proxy;
	public static final String ATT_LISTlIGNECOMMANDE = "ligneCommande";
	public static final String ATT_MODELlIVRAION = "model";
	public static final String ATT_MODEFACTURE= "model";


	public ControleurServlet() {
		super();
		this.lesLignes = new ArrayList<LigneCommande>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		initialiser(request, response);
		vue = traiterRequete();
		// Aiguillage sur la vue
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);

	}

	@Override
	public void init() throws ServletException {
		ProcessusAchatMetierService service = new ProcessusAchatMetierService();
		proxy = service.getProcessusAchatMetierPort();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		initialiser(request, response);
		vue = traiterRequete();
		// Aiguillage sur la vue
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
	}

	private void initialiser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.request = request;
		this.response = response;
		session = request.getSession(true);
		login = request.getParameter("email");
		password = request.getParameter("password");

	}

	private String traiterRequete() {
		// vérifie s'il l'utilisateur possede une session
		if ((session.getAttribute("login") == null) && (session.getAttribute("password") == null)) {
			// vérifier s'il a bien renseigné ses identifiants
			if (login != null && !login.equals("") && password != null && !password.equals("")) {
				session.setAttribute("login", login);
				session.setAttribute("password", password);
				// renvoyer sur sa page en vérifiant ses droits d'acces
				return traitementRACI();
			} else {
				// sinon lui faire rester sur la vueAuthentification.
				return "/WEB-INF/views/VueAuthentification.jsp";
			}

		} else {
			// le traitement lorque il est connecte
			return traitementRACI();
		}

	}

	private String traitementRACI() {

		String action = request.getParameter("action");
		/**
		 * Vérifier les droits pour chaque utilisateur connecté.
		 */
		String email = (String) session.getAttribute("login");
		String droit = proxy.obtenirProfil(email);

		//verifier la deconnexion 
		if (action !=null && action.equals("deconnexion")) {
			session.invalidate(); 
			vue=  "/WEB-INF/views/VueAuthentification.jsp";
		}else{
		// A travers la session recuperer le profil et lui attribuer la bonne
		// vue
		switch (droit) {
		case "achat":
			if (action != null) {
				if (action.equals("Ajouter")) {
					String libelle = request.getParameter("libelle");
					String qte = request.getParameter("qte");
					String prix = request.getParameter("prix");
					String perisable = request.getParameter("perisableSelect");
					if (libelle != null && qte != null && prix != null && perisable !=null) {
						int qteInt = Integer.parseInt(qte);
						Double prixDouble = Double.valueOf(prix);
						this.lesLignes.add(new LigneCommande(libelle, qteInt, prixDouble,perisable));
					}
					vue = "/WEB-INF/views/VueAchatCommande.jsp";

				} else if (action.equals("Commander")) {
					// préparation des données pour créer une commande
					String fournisseur = request.getParameter("fourniseur");
					int idUtilisateur = proxy.obtenirIdUtilisateur((String) session.getAttribute("login"));

					ws.Commande lastCommandeInsert = proxy.ajouterCommande(idUtilisateur, fournisseur);
					// insertion des ligne commande avec l'id de la nouvelle
					// commande
					for (LigneCommande ligneCommande : this.lesLignes) {
						if (null != lastCommandeInsert) {
							ligneCommande.setCommande(lastCommandeInsert);
							proxy.ajouterLigneCommande(ligneCommande);
						}
					}
					// VIDER LA LISTE
					lesLignes.removeAll(lesLignes);
					// prévoir un msg apres la commande et de lui proposer une
					// nouvelle commande
				}

			}else {
				// affiche la page commande
				vue = "/WEB-INF/views/VueAchatCommande.jsp";
			}

			request.setAttribute(ATT_LISTlIGNECOMMANDE, this.lesLignes);
			break;
		case "stock":

			// instancier le model
			LivraisonModel modelLivraison = new LivraisonModel();
			// afficher la liste des commandes non livré
			modelLivraison.setCommandes(proxy.getAllCommandeNonLivre());
			if (action != null) {

				if (action.equals("modifier")) {
					String reqIdCommande = request.getParameter("idcommande");
					int idcomm = Integer.parseInt(reqIdCommande);
					for (ws.Commande comde : modelLivraison.getCommandes()) {
						if (comde.getIdCommande() == idcomm) {
							modelLivraison.setCommande(comde);
						}
					}
				} else if (action.equals("Enregistrer")) {
					String dateString = request.getParameter("date");
					String livreSelect = request.getParameter("livreSelect");
					int idUtilisateur = proxy.obtenirIdUtilisateur((String) session.getAttribute("login"));
					String idCmde = request.getParameter("idCommande");
					int idcomm = Integer.parseInt(idCmde);
					// le webService pour modifier ou ajouter la livraison
					proxy.ajouterLivraison(dateString, livreSelect, idcomm, idUtilisateur);
					// vide l'objet commande dans le model
					modelLivraison.setCommande(null);
					// afficher la liste des commandes non livré
					modelLivraison.setCommandes(proxy.getAllCommandeNonLivre());
				}

			}

			// affiche la page livraison avec la liste des commande non livré
			vue = "/WEB-INF/views/VueAchatLivraison.jsp";
			// renvoyer le modelLivraion
			request.setAttribute(ATT_MODELlIVRAION, modelLivraison);
			break;

		case "comptable":
			// instancier le model
			FactureModel modelFacture = new FactureModel();
			// afficher la liste des commandes livré mais non paye
			modelFacture.setCommandes(proxy.getAllCommandeLivreNonPaye());
			if (action != null) {

				if (action.equals("modifier")) {
					String reqIdCommande = request.getParameter("idcommande");
					int idcomm = Integer.parseInt(reqIdCommande);
					for (ws.Commande comde : modelFacture.getCommandes()) {
						if (comde.getIdCommande() == idcomm) {
							modelFacture.setCommande(comde);
						}
					}
				} else if (action.equals("Enregistrer")) {
					String dateString = request.getParameter("date");
					String payeSelect = request.getParameter("payeSelect");
					int idUtilisateur = proxy.obtenirIdUtilisateur((String) session.getAttribute("login"));
					String idCmde = request.getParameter("idCommande");
					int idcomm = Integer.parseInt(idCmde);
					// le webService pour modifier ou ajouter la livraison
					proxy.ajouterFacture(dateString, payeSelect, idcomm, idUtilisateur);
					// vide l'objet commande dans le model
					modelFacture.setCommande(null);
					// afficher la liste des commandes non livré
					modelFacture.setCommandes(proxy.getAllCommandeLivreNonPaye());
				}

			}

			// affiche la page facture avec la liste des commande non livré
			vue = "/WEB-INF/views/VueAchatFacture.jsp";
			// renvoyer le modelLivraion
			request.setAttribute(ATT_MODEFACTURE, modelFacture);
			break;
		default:
			vue = "/WEB-INF/views/VueAuthentification.jsp";
			break;
		}
	}
		return vue;
	}

	private String cheminVue(HttpServletRequest request) {

		/**
		 * récupération de l'url
		 */
		String url = request.getRequestURI();

		/**
		 * 
		 * exemple url http://localhost:8080/reservation.hotel.webapp/monUrl.GLM
		 * ici on récuper la position du dernier slash et celle du dernier point
		 * 
		 */
		positionDernierSlash = url.lastIndexOf('/');
		positionDernierPoint = url.lastIndexOf('.');

		if (positionDernierPoint > positionDernierSlash && positionDernierPoint >= 0) {
			action = url.substring(positionDernierSlash + 1, positionDernierPoint);
		}
		/**
		 * effectuer un mapping entre la vue et le traitement
		 */
		switch (action) {
		case "VueAuthentification":
			vue = "/WEB-INF/views/VueAuthentification.jsp";
			break;
		case "VueAchatCommande":
			vue = "/WEB-INF/views/VueAchatCommande.jsp";
			break;
		case "VueAchatLivraison":
			vue = "/WEB-INF/views/VueAchatLivraison.jsp";
			break;
		default:
			vue = "/WEB-INF/views/VueAuthentification.jsp";
			break;
		}
		return vue;
	}
}
