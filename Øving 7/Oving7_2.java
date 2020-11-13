import java.util.*;
import java.io.InputStreamReader;



public class Oving7_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Tekst t1 = new Tekst(sc.nextLine());   //Oppretter teksten t1 etter brukerens input

        //Skriver ut all infoen
        System.out.println("Original tekst: " + t1.getTekst());
        System.out.println("Teksten i store bokstaver: " + t1.StorBokstav());
        System.out.println("Antall ord i teksten er: " + t1.AntallOrd());
        System.out.println("Hvis 'finnes' er i teksten erstattes det med 'fins': " + t1.ErstattOrd());
        System.out.println("Gjennomsnittlig ordlengde i teksten er: " + t1.GjennomsnittligOrdlengde());
        System.out.println("Gjennomsnittlig antall ord per periode er: " + t1.OrdPerPeriode());
  }
}

final class Tekst {
    String tekst;

    //Lager en konstruktør for å opprette en tekst
    Tekst (String t) {
        this.tekst=t;
    }

    //Metode for å hente ut teksten
    public String getTekst() {
        return this.tekst;      
    }

    /*Metode for å hente antall ord, gjorde ved å lage en array som blir splittet med mellomrom, 
    og finne lengden av arrayen, som da vil bli antall ord*/
    public int AntallOrd() {
        String[] nyTekst = this.tekst.split(" ");
        return nyTekst.length;
    }

    /*
    Metode for å finne gjenomsnittlig ord per periode
    Lager først en array for en periode som blir splittet med !.?:
    Lager deretter en todimensjonal array ord som har like mange arrayer som det er perioder
    Bruker en for løkke for å fylle opp ord i hver periode, brukt med å splitte med mellomrom
    Bruker en for løkke for å finne antallOrd, som er antall ord per periode
    Returnerer antall ord - (antall perioder fordi den teller med mellomrom etter tegn,
    og -1 for å ikke ta med første periode, og deler dette på hvor mange perioder det er)
     */
    public double OrdPerPeriode() {
        String[] periode = this.tekst.split("[!.?:]");
        String[][] ord = new String[periode.length][0];
        double antallOrd = 0;
        for (int i = 0; i < periode.length; i++) { {
             ord[i] = periode[i].split(" ");
            }
        }
        for(int i = 0; i < periode.length; i++ ) {
            antallOrd+= (ord[i].length);
        }
        
        return (antallOrd - (periode.length - 1))/periode.length;
    }

    //Metode som returnerer teksten i store bokstaver
    public String StorBokstav() {
        return this.tekst.toUpperCase();
    }

    //Metode som erstatter et valgt ord med et annet
    public String ErstattOrd() {
        return this.tekst.replaceAll("finnes", "fins");
    }

    /*
    Metode for å finne gjenomsnittlig ordlengde i teksten
    Først må jeg fjerne alle mulige tegn
    Lager en char-array 'alfabet' som er alle bokstavene i alfabetet i tillegg til mellomrom,
    og en char-array 'tegn' av hele teksten og tar den i små bokstaver for å sammenligne med alfabet
    Kjører to for løkker og sjekker hvis et et tegn i teksten er en del av alfabetet, 
    eller et mellomrom blir den lagt til i Stringen 'tekst'
    Deretter lager jeg en ny array 'nyTekst' som splitter 'tekst' med mellomrom og lager da en array med alle ordene
    Lager en for løkke som looper gjennom alle ordene og legger til lengden av ordet i totaltAntallBokstaver
    Returnerer totalt antall bokstaver delt på antall ord, altså gjenomsnittlig ordlengde
    */
    public double GjennomsnittligOrdlengde() {
        char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå ".toCharArray();
        char[] tegn = (this.tekst.toLowerCase()).toCharArray();
        String tekst = "";
        for (int i = 0; i < tegn.length; i++) {
            for (int k = 0; k < alfabet.length; k++) {
                if (tegn[i] == alfabet[k]) {
                    tekst += tegn[i];
                }
            }
        }
        
        String[] nyTekst = tekst.split(" ");
        double totaltAntallBokstaver = 0;
        for (int i = 0; i < nyTekst.length; i++) {
            totaltAntallBokstaver += nyTekst[i].length();
        }
        return totaltAntallBokstaver/nyTekst.length;
    }
}