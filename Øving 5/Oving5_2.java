import java.util.Random;
import java.util.*;

public class Oving5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vil du finne tilfeldige\r\n1:Heltall\r\n2:Desimaltall");
        int valg = sc.nextInt();
        MinRandom tall = new MinRandom(valg);

        if (valg == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sett inn en øvre og en nedre grense");
            int ovre = scan.nextInt();
            int nedre = scan.nextInt();
            tall.nesteHeltall(ovre, nedre);
            System.out.println(tall.helTall);
        } else if (valg == 2) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sett inn en øvre og en nedre grense");
            double ovre = scan.nextDouble();
            double nedre = scan.nextDouble();
            tall.nesteDesimaltall(ovre, nedre);
            System.out.println(tall.desTall);
        } else {
            throw new IllegalArgumentException("Ugyldig tall");
        }
    } // main slutt
} // class slutt

class MinRandom {
    Random tall = new Random();
    int helTall;
    int verdi;
    double desTall;

    public MinRandom(int v) {
        verdi = v;
    }

    public int nesteHeltall(int ovre, int nedre) {
        helTall = tall.nextInt(ovre - nedre+1) + nedre;
        return helTall;
    }

    public double nesteDesimaltall(double ovre, double nedre) {
        desTall = tall.nextDouble() * (ovre - nedre) + nedre;
        return desTall;
    }
}