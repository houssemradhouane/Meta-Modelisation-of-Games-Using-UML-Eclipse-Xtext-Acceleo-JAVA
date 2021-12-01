package game.exemple.enigme.java;

public class EnigmeLieu implements Lieu {
	
	EnigmeGame main;

	public EnigmeLieu(EnigmeGame main) {
		this.main = main;
	}
	
	public void entrer() {
		System.out.println("Lieu : Enigme");
		while (this.main.tentativeO >= 1 && !this.main.reussiteC) {
			this.main.sphinxP.interaction();
		}
		if (this.main.tentativeO == 0) {
			System.out.println("Dommage !");
			this.main.prochainLieu = this.main.EchecL;
			return;
		}
		if (this.main.reussiteC) {
			System.out.println("Bien Joué !");
			this.main.prochainLieu = this.main.SuccesL;
			return;
		}
		
	}
	
}
