package Poo;
public interface Empruntable {
	
	public default void emprunter(Livre unLivre) {
		if (unLivre.isDisponible() == true) {
			
		}
	}

}
