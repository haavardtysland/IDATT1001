import java.util.Random;
import java.util.*;

public class Oving6_2 {
    public static void main(String[] args) {
        boolean fortsett = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Skriv inn din tekst");
            String tekst = sc.nextLine().toLowerCase();
            char[] tekstArr = tekst.toCharArray();

            char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå���".toCharArray();

            int[] antallTegn = new int[30];

            for (int i = 0; i < tekstArr.length; i++) {
                for (int k = 0; k < alfabet.length; k++) {
                    if (tekstArr[i] == alfabet[k]) {

                        antallTegn[k]++;

                    }
                }

                if (Character.isLetter(tekstArr[i]) == false) {

                    antallTegn[29]++;
                }

            }
            TekstAnalyse t1 = new TekstAnalyse(antallTegn);
            System.out.println("Antall forskjellige bokstaver er: " + t1.getAntallTyperBokstaver());
            System.out.println("Totalt antall bokstaver er: " + t1.getAntallBokstaver());
            System.out
                    .println("Prosentandelen av teksten som ikke er bokstav er: " + (t1.getProsentIkkeBokstav() + "%"));
            System.out.println("Antall forekomster av bokstaven a er: " + t1.getBokstav('å'));
            System.out.println(t1.getFlestAv());
        } // do slutt
        while (fortsett == true);
    }// main slutt
}// class slutt

class TekstAnalyse {

    private int[] array;

    TekstAnalyse(int[] a) {
        this.array = a;
    }

    public int getAntallTyperBokstaver() {
        int antall = 0;
        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] != 0) {
                antall++;
            }
        }
        return antall;
    }

    public int getAntallBokstaver() {
        int antall = 0;
        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] != 0) {
                antall += this.array[i];
            }
        }
        return antall;
    }

    public double getProsentIkkeBokstav() {
        double antall = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != 0) {
                antall += this.array[i];
            }
        }
        double tegn = this.array[29];
        double prosent = ((tegn / antall) * 100);
        return prosent;
    }

    public int getBokstav(char a) {
        char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå���".toCharArray();
        int plass = 0;
        for (int i = 0; i < alfabet.length; i++) {
            if (alfabet[i] == a) {
                plass = i;
            }
        }
        return this.array[plass];
    }

    public String getFlestAv() {
        char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå���".toCharArray();
        int[] storstArr = new int[]{};
        char[] flestArr = new char[]{};
        int plass = 0;
        int storst = 0;
        String skrivUt = "Det er flest av bokstavene ";
        for (int i = 0; i < this.array.length - 1; i++) { // sjekker hvilken verdi som har størst verdi og lagrer den
            if (this.array[i] > storst) {
                storst = this.array[i];
            }
        }
        for (int i = 0; i < this.array.length - 1; i++) { // Finner ut om det er andre verdier som er like store som
                                                          // storst og legger de til i en Array kalt storstArr
            if (this.array[i] == storst) {
                storstArr = Arrays.copyOf(storstArr, storstArr.length + 1);
                storstArr[plass] = i;
                plass++;
            }
        }
        for (int i = 0; i < storstArr.length; i++) { // lager en flestArr av typen char for å kunne printe ut bokstavene
                                                     // og legger inn de eventuelle verdiene som er storst
            flestArr = Arrays.copyOf(flestArr, flestArr.length + 1);
            flestArr[i] = alfabet[storstArr[i]];
        }
        for (int i = 0; i < flestArr.length; i++) { // legger til verdiene i Stringen skrivUt
            skrivUt += flestArr[i] + " ";
        }
        return skrivUt;
    }
}// class slutt
