package game.exemple.enigme.java;

import java.util.Scanner;

public class SphinxPersonne {
	
	EnigmeGame main;
	Scanner scan = new Scanner(System.in);
	
	public SphinxPersonne (EnigmeGame main) {
		this.main = main;
	}

	public void interaction() {
		System.out.println("Le Sphinx demande : 3+3 ?");
		String reponse;
		while (true) {
			System.out.print("Choix disponibles : \n"
					+ " - 6 \n"
					+ " - 7 \n"
					+ " - 5 \n"
					+ " - 12 \n"
					+ " - 3 \n"
					+ " - 9 \n");
			reponse = scan.next();
			switch (reponse) {
			case "6":
				this.main.reussiteC = true;
				return;
			
			case "7":
				this.main.tentativeO--;
				return;
				
			case "5":
				this.main.tentativeO--;
				return;
				
			case "12":
				this.main.tentativeO--;
				return;
				
			case "3":
				this.main.tentativeO--;
				return;
				
			case "9":
				this.main.tentativeO--;
				return;
	
			default:
				System.out.println("Entrez une réponse correspondant à un des choix !");
				break;
			}
		}
	}
	
}
