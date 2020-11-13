//Dette programmet regner om tommer til centimeter

import javax.swing.JOptionPane;

public class Oving1_1 {
	public static void main (String[] arcs) {
		String tommer = JOptionPane.showInputDialog("Antall tommer ");
		double result = Double.parseDouble(tommer);	
		System.out.println(tommer + " tommer er det samme som " + result*2.54 + "cm");

	
	}
}