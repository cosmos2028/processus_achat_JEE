package model;

import java.util.ArrayList;
import java.util.List;

import ws.Commande;



public class FactureModel {


	private String msgError;
	private Commande commande ;
	private List<Commande> commandes = new ArrayList<Commande>();
	public FactureModel() {
		super();
	}
	public String getMsgError() {
		return msgError;
	}
	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
}
