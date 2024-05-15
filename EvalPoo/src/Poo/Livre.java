package Poo;
public class Livre {
	
	private String titre;
	private String auteur;
	private String isbn;
	private boolean disponible;
	
	public Livre(String titre, String auteur, String isbn, boolean disponible) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	public void afficherDetail() {
		System.out.println("Identifiant : " + this.isbn);
		System.out.println("Titre : " + this.titre);
		System.out.println("Auteur : " + this.auteur);
		System.out.println("Disponible : " + this.disponible);
	}
	
	public void emprunter() {
		this.disponible = false;
	}
	
	public void retourner() {
		this.disponible = true;
	}
}
