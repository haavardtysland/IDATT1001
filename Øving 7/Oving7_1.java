import java.util.*;
import java.io.InputStreamReader;


public class Oving7_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn din tekst her:");
        String input = sc.nextLine();
        NyString string = new NyString(input); //oppretter teksten string etter brukerens input
        NyString bokstav = new NyString("a");  //oppretter en bokstav som skal være parameter for FjernBokstav

       string.Forkort();                //Henter ut den forkorta versjonen av teksten string
       string.FjernBokstav(bokstav);    //Henter ut den teksten string, med bokstav fjernet
    }
}

final class NyString {
    String tekst;
    public NyString(String t) {
        this.tekst=t;
    }

    /*
    Lager en metode for å forkorte teksten til kun forbokstaven
     String[] f deler teksten i en array som blir splittet hver gang den ser et mellomrom, 
     dvs at f[0] er første ord, f[1] er andre ord, osv.
     Deretter kjører jeg en for løkke for hele lengden av f,
     og legger til første bokstaven i hvert ord inn i Stringen forkort
     Til slutt skriver jeg ut forkort, som nå inneholder alle de første bokstavene i hvert ord
    */

    public void Forkort() {
        String[] f = this.tekst.split(" ");
        String forkort="";
        for (int i = 0; i < f.length; i++) {
            forkort += f[i].charAt(0) ;
        } 
        System.out.println(forkort);
    }

    /*
    Lager en metode for å fjerne en bokstav med parameter bokstav for å velge hvilken bokstav som skal fjernes
    Lager en String setning som for får verdien til teksten,
    men der jeg bruker .replace(hva jeg vil endre, hva jeg skal endre det med, altså ingenting her)
    Skriver til slutt ut setning som nå har fjernet alle bokstavene av den gitte parameteren.
    */
 public void FjernBokstav(NyString bokstav) {
        String setning = "";
        System.out.println("Skal fjerne bokstaven '" + bokstav.tekst + "' fra teksten");
        setning=this.tekst.replace(bokstav.tekst, "");
        System.out.println(setning);
        
    }


}