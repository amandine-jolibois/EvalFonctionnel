package Poo;

import java.util.ArrayList;


public class Membre extends Personne {
	
	//Utilisation de long au lieu de date.
	protected long dateAdhesion;
	protected String statut;
	protected ArrayList<Livre> listeLivres = new ArrayList<Livre>();

	public Membre(String nom, String prenom, int id, long dateAdhesion, String statut) {
		super(nom, prenom, id);
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
	}

	public void emprunter(Livre unLivre) {
		listeLivres.add(unLivre);
		unLivre.emprunter();
	}

	public void retourner(Livre unLivre) {
		listeLivres.remove(unLivre);
		unLivre.retourner();
	}
	
	public void afficherDetails() {
		System.out.println("ID : " + this.id);
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prenom);
		System.out.println("Date adhesion : " + this.dateAdhesion);
		System.out.println("Statut : " + this.statut);
		
	}

}
