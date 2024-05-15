package Poo;

public class Employe extends Personne{
	
	protected String poste;
	protected double salaire;
	
	public Employe(String nom, String prenom, int id,String poste, double salaire) {
		super(nom, prenom, id);
		this.poste = poste;
		this.salaire = salaire;
		
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public void afficherDetail() {
		System.out.println("ID : " + this.id);
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prenom);
		System.out.println("Poste : " + this.poste);
		System.out.println("salaire : " + this.salaire);
	}

	
	
	
	
	

}
