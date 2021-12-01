package game.exemple.enigme.java;

public class EnigmeGame {
	
	//objets
	int tentativeO = 3;
	
	//connaissances
	boolean reussiteC = false;
	
	//personnages
	SphinxPersonne sphinxP = new SphinxPersonne(this);

	//lieux
	public EnigmeLieu EnigmeL = new EnigmeLieu(this);
	public SuccesLieu SuccesL = new SuccesLieu(this);
	public EchecLieu EchecL = new EchecLieu(this);
	
	public Lieu prochainLieu = EnigmeL;
	public boolean fin = false;
	
	public EnigmeGame() {
		while(!fin) {
			this.prochainLieu.entrer();
		}
	}
	

	public static void main(String[] args) {
		new EnigmeGame();
	}

}
