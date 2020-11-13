import java.util.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class Oving10_1 {
    public static void main(String[] args) {

        Arrangement a1 = new Arrangement(1, "Sjakkturnering", "Kalvskinnet", "NTNU", "Konkurranse", 200210051600L);
        Arrangement a2 = new Arrangement(2, "Swing seminar", "Gløshaugen", "NTNU", "Foredrag", 200210051300L);
        Arrangement a3 = new Arrangement(3, "Equinor besøker NTNU", "Dragvoll", "Equinor", "Foredrag", 200210071200L);
        Arrangement a4 = new Arrangement(4, "Volleyballturnering", "Dragvoll", "NTNUi volleyball", "Konkurranse", 200210051400L);
        Arrangement a5 = new Arrangement(5, "Gratis kaffe", "Gløshaugen", "Ali Kaffe", "Sosialt", 200210051200L);
        ArrangementRegister register = new ArrangementRegister();

        register.RegistrerArrangement(a1);
        register.RegistrerArrangement(a2);
        register.RegistrerArrangement(a3);
        register.RegistrerArrangement(a4);
        register.RegistrerArrangement(a5);

        boolean run = true;

        while (run) {

            String[] meny = { "Finne arrangement på et sted", "Finne arrangement på på en dato",
                    "Finne arrangement mellom to datoer", "Liste over alle arrangementene", "Avbryt" };
            int valg = showOptionDialog(null, "Hva vil du endre?", "click a button", DEFAULT_OPTION,
                    INFORMATION_MESSAGE, null, meny, meny[0]);

            switch (valg) {
            case 0:
                String input = showInputDialog("Hvor vil du sjekke?");
                System.out.println(register.ArrangementPaaSted(input));
                break;
            case 1:
                String input1 = showInputDialog("Skriv dato på formen ååååmmdd");
                int dato = Integer.parseInt(input1);
                System.out.println(register.ArrangementPaaDato(dato));
                break;
            case 2:
                String input2 = showInputDialog("Skriv startdato på formen ååååmmdd");
                String input3 = showInputDialog("Skriv sluttdato på formen ååååmmdd");
                int dato1 = Integer.parseInt(input2);
                int dato2 = Integer.parseInt(input3);
                System.out.println(register.ArrangementMellomDato(dato1, dato2));
                break;
            case 3:
                System.out.println(register.AlleArrangement());
                break;
            case 4:
                run = false;
                break;
            }
        }
    }
}