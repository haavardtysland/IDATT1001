import java.util.*;

import sun.tools.jstat.SymbolResolutionClosure;

import static javax.swing.JOptionPane.*;

public class Oving8 {
    public static void main(String[] args) {
        Person p1 = new Person("Håvard", "Tysland", 1998);
        ArbTaker a1 = new ArbTaker(p1, 1, 2005, 88000, 0.32);
        boolean run = true;
        
        while (run) {

        String[] meny = {"Arbeidstakernr", "Ansettelsesår", "Månedslønn", "Skatteprosent", "Avbryt"};
        int valg = showOptionDialog(null, "Hva vil du endre?", "click a button", DEFAULT_OPTION, INFORMATION_MESSAGE, null, meny, meny[0]);

        switch(valg){
            case 0: 
            String input = showInputDialog("Nytt arbeidstakernr");
            int nyttArbtakernr = Integer.parseInt(input);
            a1.setArbtakernr(nyttArbtakernr);
            break;
            case 1:
            String input1 = showInputDialog("Nytt ansettelsesår");
            int nyttAnsettelsesAar = Integer.parseInt(input1);
            a1.setAnsettelsesAar(nyttAnsettelsesAar);
            break;
            case 2:
            String input2 = showInputDialog("Ny månedslønn");
            double nyMaanedslonn = Double.parseDouble(input2);
            a1.setMaanedslonn(nyMaanedslonn);
            break;
            case 3:
            String input3 = showInputDialog("Ny skatteprosent");
            double nySkatteprosent = Double.parseDouble(input3);
            a1.setSkatteprosent(nySkatteprosent);
            break;
            case 4:
            run = false;
            break;
        }
        System.out.println(a1.fulltNavn());
        System.out.println("har arbeidertakernr: " + a1.getArbtakernr());
        System.out.println("er " + a1.Alder() + " år gammel");
        System.out.println("har vært ansatt siden " + a1.getAnsettelesAar());
        System.out.println("har jobbet i " + a1.aarAnsatt() + " år");
        System.out.println("har vært ansatt mer enn 15 år: " + a1.AnsattMerEnn(15));
        System.out.println("har månedslønn: " + a1.getMaanedslonn() + "kr");
        System.out.println("tjener " + a1.BruttoLonn() + " kr i året");
        System.out.println("skatter: " + a1.getSkatteprosent() + "% av lønnen sin");
        System.out.println("skatter " + a1.SkattPerAar() + "kr i året");
    }//while slutt
    } // main slutt
} // Oving8 slutt
