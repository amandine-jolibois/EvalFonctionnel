package Poo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Membre membre1 = new Membre("JOLIBOIS", "Amandine", 1, System.currentTimeMillis(), "Actif");
		Employe employe1 = new Employe("FORCIOLI", "Marine", 1, "Dev", 2000.2);
		Livre livre1 = new Livre("Astérix et Obélix", "Uderzo", "12D3B", true);
		Livre livre2 = new Livre("L'éléphant bleue", "Marcus", "89Z5N", true);

		/*System.out.println("--- Détails Membre ---");
		System.out.println(" ");
		membre1.afficherDetails();
		System.out.println(" ");
		System.out.println("--- Détails Livre ---");
		System.out.println(" ");
		livre1.afficherDetail();
		System.out.println(" ");*/

		ArrayList<Personne> listePersonnes = new ArrayList<>();

		listePersonnes.add(membre1);
		listePersonnes.add(employe1);

		for (int i = 0; i < listePersonnes.size(); i++) {
			System.out.println("--- Détails Personne " + (i+1) + " ---");
			System.out.println(" ");
			listePersonnes.get(i).afficherDetails();
			System.out.println(" ");
		}
		
		membre1.emprunter(livre1);
		System.out.println("--- Détails du Livre emprunter et détails sur l'emprunteur ---");
		System.out.println(" ");
		livre1.afficherDetail();
		System.out.println(" ");
		membre1.afficherDetails();
		System.out.println(" ");
		
		membre1.retourner(livre2);
		System.out.println("--- Détails du Livre retourner ---");
		System.out.println(" ");
		livre2.afficherDetail();
		System.out.println(" ");
		
		

	}

}
