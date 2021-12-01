package game.exemple.enigme.java;

public class SuccesLieu implements Lieu {

	EnigmeGame main;

	public SuccesLieu(EnigmeGame main) {
		this.main = main;
	}
	
	public void entrer() {
		System.out.println("Lieu : Succès");
		this.main.fin = true;
	}
	
}
