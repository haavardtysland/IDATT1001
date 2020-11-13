//Sjekker om et tall er et primtall

import static javax.swing.JOptionPane.*;

public class Oving3_2 {
	public static void main (String[] args) {
		boolean run = true;	 															//Lager en variabel som har verdien true for slik at programmet skal kunne kjøre om og om igjen
		
		while (run) {																	//Lager en while-løkke som gjør at programmet kjører om og om igjen ettersom run=true
		String tall = showInputDialog("Hvilket tall vil du sjekke?");		            //Lager en InputDialog slik at brukeren kan velge hvilket tall som skal sjekkes
		int n = Integer.parseInt(tall);													//Parser valgt tall fra String til int slik at programmet klarer å lese tallet som blir lagt inn
		int m = n/2;																	//Lager en variabel m som er lik valgt tall delt på to																		
		int flag = 0;																	//Lager en variabel flag og tilderen verdien 0 (Brukes som en boolean 0=false, 1=true)
		if(n==0 || n==1)  {																//Sjekker om valgt tall er 0 eller 1									
			System.out.println(n + " er ikke et primtall.");							//Hvis det stemmer skriver programmet ut at valgt tall ikke er et primtall
			flag=1;	
			}																	
			for (int i=2; i<=m;i++) {													//Hvis ikke sjekker programmet for hver verdi fra 2 til og med m (altså valg tall delt på to)
				if (n%i==0){															//Programmet sjekker om valgt tall kan deles på i for hver verdi valgt over uten å ha rest
					System.out.println(n + " er ikke et primtall.");					//Hvis tallet kan deles på noen av disse tallene vil det da si at det ikke er et primtall og programmet skriver dette ut
					flag=1;
					break;																//Angir flag verdien 1 ettersom den nå er sann (flag=1, true)
				}
				} if (flag==0) {														//Hvis tallet ikke kan deles på noen av disse verdiene vil det da si at det er et primtall (flag=0, altså false)
				System.out.println(n + " er et primtall.");								//Programmet skriver dette ut
		}
		}
	}
}

