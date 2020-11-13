import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rett {
    final private String navn;
    final private String type;
    private int pris;
    private String oppskrift;

    public Rett(String n, String t, int p, String o) {
        this.navn = n;
        this.type = t;
        this.pris = p;
        this.oppskrift = o;
    }


    public String getNavn() {
        return this.navn;
    }

    public String getType() {
        return this.type;
    }

    public int getPris() {
        return this.pris;
    }

    public String toString() {
        return this.navn + " " + this.type + " " + this.pris + "kr" + "\r\nOppskrift:" + this.oppskrift + "\r\n";
    }
}