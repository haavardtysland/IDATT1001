//Dette programmet er et terningspill mellom to spillere, der det handler om å komme seg til 100 poeng først

import static javax.swing.JOptionPane.*;
import java.util.Random;

public class Oving4_2 {
	public static void main (String[] args) {
		
		String spiller1 = showInputDialog("Spiller 1");
		String spiller2 = showInputDialog("Spiller 2");

			
		Spiller s1 = new Spiller(spiller1);
		Spiller s2 = new Spiller(spiller2);
		
		System.out.println(spiller1 + " og " + spiller2 + " spiller nå om å komme til akkurat 100 poeng.");
		
		int runde = 1;
						
		while (s1.sumPoeng <105 && s2.sumPoeng < 105) {	
			System.out.println("Runde " + runde++ + ":");
			s1.kastTerningen();
			s2.kastTerningen();
			
			
			if (s1.erFerdig() && s2.erFerdig()) {
				System.out.println(" Det ble uavgjort.");
				break;
			} 
			if (s1.erFerdig()) {
				System.out.println( "Vi har en vinner!");
				System.out.println(s1.toString());
				break;
			} 
			
			
			if (s2.erFerdig()) {
				System.out.println( "Vi har en vinner!");
				System.out.println(s2.toString());
				break;
			} 	
		}
	}//main slutt
}//class slutt

class Spiller {
	int sumPoeng;
	final String name;
	int terningkast;
	
	Spiller (String n) {
		this.name=n;
	}
	
		
	public void kastTerningen(){
		Random terning = new Random();
		terningkast = terning.nextInt(6)+1;
		
		if (sumPoeng>100) {
			sumPoeng=(sumPoeng - terningkast);
		 }		
		 else {
		sumPoeng+=terningkast;
		}
		if (terningkast==1) {
			sumPoeng=0;
		} 
				
		System.out.println(this.name + " kastet " + terningkast + " og har nå " + sumPoeng + " poeng.");
	}	
	
	public boolean erFerdig(){
		boolean run = false;
		 if (sumPoeng == 100) {
		 run = true;
		}
		return run;
	}
	public String toString() {
		return this.name + " vant med " + sumPoeng + " poeng.";
	}
}//class slutt

