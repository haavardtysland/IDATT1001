//Dette programmet skriver opp gangetabellen fra et tall til et annet

import static javax.swing.JOptionPane.*;
import javax.swing.JFrame;

public class Oving3_1 {
	public static void main (String[] args) {
	    JFrame frame = new JFrame();  													  //Lager en JFrame for å få opp en pop-up boks
	    String message = "Hei, her kan du skrive ut en del av gangetabellen"; 	  	 	  //Lager en String for beskjeden du vil vise 
       	showMessageDialog(frame,message); 									//Lager en MessageDialog med tekst som viser tekst
		
		String startNum = showInputDialog("Start");							//Lager en Input boks til å skrive inn hvor brukeren ønsker å starte
		String endNum = showInputDialog("Slutt"); 							//Lager en Input boks til å skrive inn hvor brukeren ønsker å stoppe
		int start = Integer.parseInt(startNum); 										  //Parser fra String til int
		int end = Integer.parseInt(endNum); 											  //Parser fra String til int
		
		for (int n=start; n<=end; n++) {												   //Lager en for-løkke som starter med start-verdien og ender med slutt-verdien brukeren satt inn, og øker med 1				
			for(int i=1;i<=10; i++) {													  //Lager en for-løkke som skal brukes for tallet n skal ganges med, altså fra 1 til 10, og øker med 1 for hver
				System.out.println(n + "x" + i + "=" + (n*i));							   //Programmet skriver ut regnestykkene
			}
		}		
		}
}