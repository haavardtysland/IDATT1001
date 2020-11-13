//Dette programmet regner hvor mange stimer, minutt og sekund det er ut i fra antall sekunder i inndataen

import javax.swing.JOptionPane;

public class Oving1_3 {
	public static void main (String[] arcs) {
		String sekundLest = JOptionPane.showInputDialog("Antall sekund");
		int sekund = Integer.parseInt(sekundLest);
		int timer = (sekund / 3600);
		int minutt = ((sekund % 3600)/60);
		int sluttSekund = (sekund % 60);
			
		
		
		if (timer==1) {
			System.out.println( timer + " time, " + minutt + " minutt, " + sluttSekund + " sekund" );
		} else {
			System.out.println( timer + " timer, " + minutt + " minutt, " + sluttSekund + " sekund" );
		}
	}
}