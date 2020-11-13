//Dette programmet regner ut hvilket kjøttmerke som er billigst og hvor mye det vil koste å kjøpe det antallet med kjøtt du ønsker å kjøpe

import javax.swing.JOptionPane;

public class Oving2_2 {
	public static void main (String[] args) {
		double merkeA = 35.90/450;																				//Lager en variabel for prisen per gram for merke A
		double merkeB = 39.50/500;																				//Lager en variabel for prisen per gram for merke A
		
		if (merkeA<merkeB){																						//Lager en if setning som sjekker om merke A er billigere enn B
			System.out.println("Kjøttdeig av merke A er billigst og koster " + merkeA + "kr per gram");			//Hvis det er billigere vil programmet skrive dette ut 
			String gram = JOptionPane.showInputDialog("Hvor mange gram skal du ha?");							//I tillegg vil det spør brukeren hvor mange gram den ønsker
			double antallGram = Double.parseDouble(gram);														//Parser fra String til Int fordi det som skal leses er et heltall
			System.out.println(gram + "g med kjøtt vil koste deg " + (antallGram*merkeA) + "kr");				//Programmet regner og skriver ut hvor mye antall gram vil koste
		} else {
			System.out.println("Kjøttdeig av merke B er billigst og koster " + merkeB + "kr per gram");			//Hvis ikke if setningen stemmer vil programmet utføre dette
			String gram = JOptionPane.showInputDialog("Hvor mange gram skal du ha?");
			double antallGram = Double.parseDouble(gram);
			System.out.println(gram + "g med kjøtt vil koste deg " + (antallGram*merkeB) + "kr");				//Programmet regner og skriver ut hvor mye antall gram vil koste
		}

	}
}