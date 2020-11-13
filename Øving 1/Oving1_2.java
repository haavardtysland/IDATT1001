//Dette programmet regner hvor mange sekund det er fra timer, minutt og sekund

import static javax.swing.JOptionPane.*;

public class Oving1_2 {
	public static void main (String[] arcs) {
		String timer = showInputDialog("Antall timer");
		String minutt = showInputDialog("Antall minutt");
		String sekund = showInputDialog("Antall sekund");
		
		int resultTimer = Integer.parseInt(timer);
		int resultMinutt = Integer.parseInt(minutt);
		int resultSekund = Integer.parseInt(sekund);
		
		
		System.out.println(timer + " timer," + minutt + " minutt," + sekund + "sekund er det samme som " + (resultTimer*3600 + resultMinutt*60 + resultSekund) + " sekunder");
	}
}