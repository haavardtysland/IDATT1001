import java.util.ArrayList;
import java.util.List;

public class Meny {
    private ArrayList<Rett> meny;
    private String navn;

    public Meny(String n) {
        this.meny = new ArrayList<Rett>();
        this.navn = n;
    }

    public String getMenyNavn() {
        return this.navn;
    }

    public ArrayList<Rett> getMenyer() {
        return this.meny;
    }

    public int getMenyPris() {
        int pris = 0;
        for (int i = 0; i < this.meny.size(); i++) {
            pris += this.meny.get(i).getPris();
        }
        return pris;
    }

    public void LeggTilRett(Rett rett) {
        this.meny.add(rett);
    }

    public String menyToString() {
        String utskrift = "";
        for (int i = 0; i < this.meny.size(); i++) {
            utskrift += this.meny.get(i).toString();
        }
        return utskrift;
    }
}