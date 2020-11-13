import java.util.*;
import java.util.ArrayList;


/**
Klassen Oving11
* @version 15.00 2019-31-10
* @author Håvard Tysland
 */
public class Oving11 {

    public static void main(String[] args) {
            boolean fortsett = true;

            Register register = new Register();
            register.LeggTilEiendom(new Eiendom(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen"));
            register.LeggTilEiendom(new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
            register.LeggTilEiendom(new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
            register.LeggTilEiendom(new Eiendom(1445, "Gloppen", 74, 188, 1457.2, "Karl Ove Bråten"));
            register.LeggTilEiendom(new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));
            int valg = 0;

        while(fortsett) {
            System.out.println("Eiendomsregister");
            System.out.println("1. Legge til eiendom");
            System.out.println("2. Se alle eiendommene");
            System.out.println("3. Finn en eiendom ");
            System.out.println("4. Regne ut gjenomsnittsareal av alle eiendommene");
            System.out.println("9. Avslutte programmet");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                valg = sc.nextInt();
            } else {
                System.out.println("Du må skrive inn et tall, ikke tekst");
            }  
                switch (valg) {
                    case 1:
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Skriv inn følgende på den nye eiendommen:");
                        System.out.println("Kommunenr"); int kommunenr = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Kommunenavn"); String kommunenavn = scan.nextLine();
                        System.out.println("Gårdnummer"); int gnr = scan.nextInt();
                        System.out.println("Bruksnummer"); int bnr = scan.nextInt();
                        System.out.println("Areal"); double areal = scan.nextDouble();
                        scan.nextLine();
                        System.out.println("Eier"); String eier = scan.nextLine();
                        System.out.println("Skriv 1 hvis du vil legge inn et bruksnavn. skriv inn hva som helst hvis ikke"); int svar = scan.nextInt();
                        if(svar != 1){
                           Eiendom e6 = new Eiendom(kommunenr, kommunenavn, gnr, bnr, areal, eier);
                            System.out.println(register.LeggTilEiendom(e6));
                        } else {
                            scan.nextLine();
                            System.out.println("Skriv inn bruksnavn"); String bruksnavn = scan.nextLine();
                            Eiendom e6 = new Eiendom(kommunenr, kommunenavn, gnr, bnr, bruksnavn, areal, eier);
                            System.out.println(register.LeggTilEiendom(e6));
                        }
                        break;
                    case 2:
                        System.out.println(register.AlleEiendommerToString());
                        System.out.println(register.sorter());
                        break;
                    case 3:
                        System.out.println("Skriv inn kommunenr, gårdsnummer og bruksnummer på formen komunnenr/gnr-bnr");
                        Scanner newsc = new Scanner(System.in);
                        String ID = newsc.nextLine();
                        System.out.println(register.FinnEiendomGittID(ID));
                        break;
                    case 4:
                        System.out.println(register.GjennomsnittsAreal());
                        break;
                    case 9:
                        fortsett = false;
                        break;
                }
            }
    }
}