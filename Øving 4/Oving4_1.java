//Dette programmet regner valutaer fra og til norske kroner

import static javax.swing.JOptionPane.*;

public class Oving4_1 {
		
	public static void main (String[] args) {
		boolean run = true;		
		
		do  {																																					//Lager en do-while for starte programmet om igjen 
			String meny = showInputDialog(" Sett inn følgende tall for å velge valuta:\r\n1:dollar\r\n2:euro\r\n3:svenske kroner\r\n4:avslutt");
			int valg = Integer.parseInt(meny);
					
			//Lager en if setning og basert på hvilket tall brukeren legger inn blir det tilegnet verdier for enten dollar, euro og svenske kroner som blir satt og hentet ut senere 
			if (valg==1){	
				Valuta dollar = new Valuta("Dollar", 9.00);																										
				dollar.regnOm();
						
			} else if (valg==2) {
				Valuta euro = new Valuta("Euro", 9.99);
				euro.regnOm();
								
			} else if (valg==3) {
				Valuta sek = new Valuta("SEK", 0.93);
				sek.regnOm();
			} else if (valg==4) {
				run=false;
				System.out.println("Du valgte å avslutte programmet.");
			
			} else {
				System.out.println("Du valgte ingen gyldige alternativ, prøv igjen");
			}
		} while (run); 
		
		
	}//main slutt
}//class slutt

class Valuta { //Oppretter en ny class kalt valuta
	String navn;
	double kurs;
				
	Valuta(String n, double k){ //Oppretter en konstruktør Valuta der navn og kurs blir lagt inn basert på brukerens valg av valuta
	this.navn=n; 
	this.kurs=k;
	}

				
		void regnOm() {
		String meny = showInputDialog("Du valgte " + this.navn + ". Vil du regne om fra \r\n1:" + this.navn + " til NOK \r\n2:NOK til " + this.navn);
		int valg = Integer.parseInt(meny);		
		
			if (valg==1) {
				String velgTall = showInputDialog("Hvilket tall vil du regne om fra " + this.navn + " til NOK?");
				double resultat = Double.parseDouble(velgTall);
				System.out.println(resultat + " " + this.navn +  " = " + (resultat*this.kurs) + " NOK");
			} else if (valg==2) {
				String velgTall = showInputDialog("Hvilket tall vil du regne om fra NOK til " + this.navn);
				double resultat = Double.parseDouble(velgTall);
				System.out.println(resultat + " NOK = " + (resultat/this.kurs));
			} else {
				System.out.println("Du har valgt et ugyldig tall");
			}
	}//regnOm slutt
}//class slutt
		