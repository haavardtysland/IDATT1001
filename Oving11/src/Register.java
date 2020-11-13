import java.util.ArrayList;
import java.util.Collections;

/**
 Klassen Register
 * @version 18:12 2019-31-10
 * @author Håvard Tysland
 */

public class Register {
    private ArrayList<Eiendom> register;

    /**
     *En konstruktør som opretter et register med eiendommer
     */
    public Register() {
        this.register = new ArrayList<Eiendom>();
    }

    /**
     * Metode for å legge til en eiendom i et register
     * @param e for å bestemme hvilken eiendom som skal bli lagt til i registeret
     * @return returnerer true hvis eiendommen ikke finnes i registeret fra før og legger den til i registeret, ellers returnerer den false
     */
    public boolean LeggTilEiendom(Eiendom e){
        if( e == null) {
            return false;
        }
        if(this.register.contains(e)) {
            return false;
        } else {
            this.register.add(e);
            return true;
        }
    }

    /**
     * Metode for å slette eiendom
     * @param e
     * @return returnerer true og fjerner eiendommen hvis den finnes i registeret, ellers returnerer false
     */
    public boolean SletteEiendom(Eiendom e){
        if (e == null){
            return false;
        }
        if(this.register.contains(e)){
            this.register.remove(e);
            return true;
        } else {
            return false;
        }
    }

    public int AntallEiendomer(){
        return this.register.size();
    }

    /**
     * Metode for å finne en eiendom gitt eiendommens id
     * @param ID som er skrevet av brukeren på formen oppgitt i oppgaveteksten
     * @return Ettersom man skal finne kun en eiendom looper den igjennom og returnerer en eiendom hvis den finner en som har den ID-en, ellers returnerer den null
     */

    public Eiendom FinnEiendomGittID(String ID) {
        ArrayList<Eiendom> liste = new ArrayList<Eiendom>();
        for(int i = 0; i < this.register.size(); i++) {
            if (this.register.get(i).getEiendomsID().equals(ID)) {
                return this.register.get(i);
            }
        }
        return null;
    }


    /**
     * Metode for å regne ut gjennomsnittsarealet,
     * looper gjennom og legger til arealet til hver eiendom
     * @return returnerer totalverdien av arealet delt på antall eiendommer
     */

    public double GjennomsnittsAreal(){
        double areal = 0;
        for(int i = 0; i < this.register.size(); i++) {
            areal += this.register.get(i).getAreal();
        }
        return areal/this.register.size();
    }


    /**
     * Metode for å finne en eiendom gitt gårdsnummer
     * @param gnr for å sammenligne med gnr til et register
     * @return returnerer en liste av objekter som har samme gnr som brukeren la inn
     */
    public ArrayList<Eiendom> FinnEiendomGittGnr(int gnr) {
    ArrayList<Eiendom> liste = new ArrayList<Eiendom>();
        for(int i = 0; i < this.register.size(); i++) {
            if(this.register.get(i).getGnr() == gnr) {
            liste.add(this.register.get(i));
            }
        }
    return liste;
    }


    /*public ArrayList<Eiendom> sorter() {
        ArrayList<Eiendom> liste = new ArrayList<Eiendom>(); //lager en dypkopi av listen (komposisjon)
        for( int i = 0; i < this.register.size(); i++) {
            if(this.register.get(i).getBruksnavn() != null) {
                liste.add(new Eiendom(this.register.get(i).getKommunenr(), this.register.get(i).getKommunenavn(), this.register.get(i).getGnr(), this.register.get(i).getBnr(), this.register.get(i).getBruksnavn(), this.register.get(i).getAreal(), this.register.get(i).getEier()));
            } else {
                liste.add(new Eiendom(this.register.get(i).getKommunenr(), this.register.get(i).getKommunenavn(), this.register.get(i).getGnr(), this.register.get(i).getBnr(), this.register.get(i).getAreal(), this.register.get(i).getEier()));

            }
        }
        Collections.sort(liste, Eiendom.sammenligner); //brukes metoden sort fra klassen Collections, som tar listen og sammenligneren jeg lagde i
        return liste;

    }*/

    /**
     * Metode som sorter alfabetisk
     * @return
     */
    public ArrayList<Eiendom> sorter() {
        ArrayList<Eiendom> liste = new ArrayList<Eiendom>(); //lager en dypkopi av listen (komposisjon)
        for (int i = 0; i < this.register.size(); i++) {
            if (this.register.get(i).getBruksnavn() != null) {
                liste.add(new Eiendom(this.register.get(i).getKommunenr(), this.register.get(i).getKommunenavn(), this.register.get(i).getGnr(), this.register.get(i).getBnr(), this.register.get(i).getBruksnavn(), this.register.get(i).getAreal(), this.register.get(i).getEier()));
            } else {
                liste.add(new Eiendom(this.register.get(i).getKommunenr(), this.register.get(i).getKommunenavn(), this.register.get(i).getGnr(), this.register.get(i).getBnr(), this.register.get(i).getAreal(), this.register.get(i).getEier()));

            }
        }
        for(int i = 0; i < liste.size(); i++) { //går gjennom liste.get(0), så iste.get(1) osv og sammenligner
            for(int j = i + 1; j < liste.size(); j++) { //sammenligner med alle objektene etter det objektet som er valgt i den første for løkken, derav j = i + 18
                if(liste.get(i).compareTo(liste.get(j)) > 0) { //hvis den første eiendommen sin eier er foran den den blir sammenlignet med sin i alfabetet, altså hvis liste.get(j) er foran liste.get(i) i alfabetet
                    Eiendom tmp = liste.get(i); //lager da en midlertidig eiendom tmp som inneholder referansen til den eiendommen som er bak i alfabetet, men ligger tidligst av de to i listen
                    liste.set(i, liste.get(j)); //Bytter plass slik at den første i alfabetet settes der andre hadde plass i listen
                    liste.set(j, tmp); //Setter tmp (som inneholder verdien til den som lå bak i alfabetet) i plassen til der det andre objektet tidligere lå
                }
            }
        }
        return liste;
    }


    /**
     * toStringMetode for å skrive ut alle eiendommene i et register
     * @return en string med alle eiendommene
     */

    public String AlleEiendommerToString(){
        String utskrift = "";
        for(int i = 0; i < this.register.size(); i++) {
            utskrift+=this.register.get(i).toString();
        }
        return utskrift;
    }
}
