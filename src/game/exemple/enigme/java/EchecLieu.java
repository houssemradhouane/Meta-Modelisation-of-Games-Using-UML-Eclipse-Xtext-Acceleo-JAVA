package game.exemple.enigme.java;

public class EchecLieu implements Lieu {

	EnigmeGame main;

	public EchecLieu(EnigmeGame main) {
		this.main = main;
	}
	
	public void entrer() {
		System.out.println("Lieu : Echec");
		this.main.fin = true;		
	}
	
}
