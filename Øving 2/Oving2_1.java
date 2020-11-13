//Sjekker om et år er et skuddår

import javax.swing.JOptionPane;

public class Oving2_1 {
	public static void main (String[] args) {
		String tall = JOptionPane.showInputDialog("Hvilket år vil du sjekke?"); //Lager en input boks for at brukeren kan sette inn et år de vil sjekke
		int n = Integer.parseInt(tall); 										//Parser String til en int for å ettersom det er tall som skal leses fra brukeren

		if (n%100==0) {															//sjekker om tallet bruken skrev inn kan deles på 100, hvis det stemmer er det et hundreår
			if (n%400==0){														//sjekker om hundreåret kan deles på 400
				System.out.println("Året " + n + " er et skuddår.");			//hvis tallet kan deles på 400 er det et skuddår, og programmet skriver dette ut
			} else {
				System.out.println("Året " + n + " er ikke et skuddår.");		//hvis ikke skriver programmet ut at året ikke er et skuddår
			}	
		} else if (n%4==0) {													//hvis ikke sjekker vi om tallet kan deles på 4
			System.out.println("Året " + n + " er et skuddår.");				//hvis det kan deles på 4 er det et skuddår, og programmet skriver dette ut
		} else {														
			System.out.println("Året " + n + " er ikke et skuddår.");			//hvis ikke skriver programmet ut at året ikke er et skuddår
		}
	}
} 