import java.util.ArrayList;
import java.util.Comparator;

/**
Klassen Eiendom
* @version 15.00 2019-31-10
* @author Håvard Tysland
*/
public class Eiendom {

    final private int kommunenr;
    final private String kommunenavn;
    final private int gnr;
    final private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;

    /**
     * Konstruktør som oppretter et objekt av typen Eiendom der eiendommen har et bruksnavn
     *
     * @param kommunenr
     * @param kommunenavn
     * @param gnr
     * @param bnr
     * @param bruksnavn
     * @param areal
     * @param eier
     */

    public Eiendom(int kommunenr, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    /**
     * Konstruktør som oppretter et objekt av typen Eiendom der eiendommen ikke har et bruksnavn
     *
     * @param kommunenr
     * @param kommunenavn
     * @param gnr
     * @param bnr
     * @param areal
     * @param eier
     */
    public Eiendom(int kommunenr, String kommunenavn, int gnr, int bnr, double areal, String eier) {
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.areal = areal;
        this.eier = eier;
    }

    /**
     * Metode for å hente kommunenr
     * @return kommunenr
     */
    public int getKommunenr() {
        return kommunenr;
    }

    /**
     * Metode for å hente kommunenavn
     * @return kommunenavn
     */
    public String getKommunenavn() {
        return kommunenavn;
    }

    /**
     * Metode for å hente gårdsnummer
     * @return gnr
     */
    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEier() {
        return eier;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    public String getEiendomsID() {
        return kommunenr + "/" + gnr + "-" + bnr;
    }

    /*public static Comparator<Eiendom> sammenligner = new Comparator<Eiendom>() { //lager en klassevariabel å sammenligne to eiendommer på, denne er statisk og kan bli kalt uten å lage et objekt av klassen
        @Override
        public int compare(Eiendom e1, Eiendom e2) {
            return e1.getEier().compareTo(e2.getEier()); //sammenligner Eieren til de to Eiendommene  ved compareTo metoden
        }
    };*/


    public int compareTo(Eiendom eiendom) {
        return this.getEier().toLowerCase().compareTo(eiendom.getEier().toLowerCase());
    }

    @Override
    public String toString() {
        if (bruksnavn != null) {
            return "Eiendom{" +
                    "kommunenavn='" + kommunenavn + '\'' +
                    ", kommunenr-gnr/bnr=" + kommunenr + "-" + gnr + "/" + bnr +
                    ", bruksnavn='" + bruksnavn + '\'' +
                    ", areal=" + areal +
                    ", eier='" + eier + '\'' +
                    '}' + "\r\n";
        } else {
            return "Eiendom{" +
                    "kommunenavn='" + kommunenavn + '\'' +
                    ", kommunenr-gnr/bnr=" + kommunenr + "-" + gnr + "/" + bnr +
                    ", areal=" + areal +
                    ", eier='" + eier + '\'' +
                    '}' + "\r\n";
        }
    }
}
