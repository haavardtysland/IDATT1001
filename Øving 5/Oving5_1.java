
import static javax.swing.JOptionPane.*;

public class Oving5_1 {
	public static void main(String[] args) {
		Brok b2 = new Brok(2,3);
		Brok b1;
		String velgBrok = showInputDialog("Sett inn tall du vil regne med, bruk / for å for å skrive brøk");
		if (velgBrok.indexOf("/") < 0) {
			int teller = Integer.parseInt(velgBrok);
			b1 = new Brok(teller);
		} else {
			String[] res = velgBrok.split("/");
			int teller = Integer.parseInt(res[0]);
			int nevner = Integer.parseInt(res[1]);
			b1 = new Brok(teller, nevner);
		}

		String meny = showInputDialog("Vil du\r\n1:Multiplisere\r\n2:Dividere\r\n3:Summere\r\n4:Subtrahere");
		int resultat = Integer.parseInt(meny);

		if (resultat == 1) {
			b1.Multipliser(b2);
		} else if (resultat == 2) {
			b1.Divider(b2);
		} else if (resultat == 3) {
			b1.Summer(b2);
		} else if (resultat == 4) {
			b1.Subtraher( );
		} else {
			System.out.println("Ugyldig valg");
		}

	} // main slutt
}// class slutt

class Brok {
	int teller;
	int nevner;

	public Brok(int t, int n) {
		this.teller = t;
		this.nevner = n;

		if (nevner == 0) {
			throw new IllegalArgumentException("Kan ikke dele på 0");
		}

	}

	public Brok(int t) {
		this.teller = t;
		this.nevner = 1;
	}

	public int getTeller() {
		return this.teller;

	}

	public int getNevner() {
		return this.nevner;
	}

	void Multipliser(Brok b2) {
		if (nevner == 1) {
			System.out.println(teller + "/" + nevner + " * " + b2.getTeller() + "/" + b2.getNevner() + " = " + (teller * b2.getTeller() + "/" + nevner * b2.getNevner()));
		} else {
			System.out.println(teller + "/" + nevner + " * " + b2.getTeller() + "/" + b2.getNevner() + " = " + (teller * b2.getNevner() + "/" + nevner * b2.getNevner()));
		}
	}

	void Divider(Brok b2) {
		if (nevner == 1) {
			System.out.println("(" + teller + "/" + nevner + ")/(" + b2.getTeller() + "/" + b2.getNevner() + ") = " + teller * b2.getNevner() + "/" + b2.getTeller());
		} else {
			System.out.println(
					"(" + teller + "/" + nevner + ")/(" + b2.getTeller() + "/" + b2.getNevner() + ") = " + (teller * b2.getNevner()) + "/" + nevner * b2.getTeller());
		}
	}

	void Summer(Brok b2) {
		if (nevner == 1) {
			System.out.println(
			 		"" + teller + "/" + nevner + " + " + b2.getTeller() + "/" + b2.getNevner() + " = " + ((teller * b2.getNevner()) + (b2.getTeller()*nevner)) + "/" + (nevner * b2.getNevner()));
		} else {
			System.out.println(
					"" + teller + "/" + nevner + " + " + b2.getTeller() + "/" + b2.getNevner() + " = " + ((teller * b2.getNevner()) + (b2.getTeller()*nevner)) + "/" + (nevner * b2.getNevner()));
		}
	}

	void Subtraher(Brok b2) {
		if (nevner == 1) {
			System.out.println("" + teller + "/" + nevner + " - " + b2.getTeller() + "/" + b2.getNevner() + " = " + ((teller * b2.getNevner()) - (nevner * b2.getTeller()))
					+ "/" + nevner * b2.getNevner());
		} else {
			System.out.println("" + teller + "/" + nevner + " - " + b2.getTeller() + "/" + b2.getNevner() + " = " + ((teller * b2.getNevner()) - (nevner * b2.getTeller()))
					+ "/" + nevner * b2.getNevner());
		}
	}
} // class slutt
