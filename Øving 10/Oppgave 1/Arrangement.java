import java.util.Collections;

public class Arrangement {
    final int nummer;
    String navn;
    String sted;
    String arrangor;
    String type;
    long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangor, String type, long tidspunkt) {
        this.nummer=nummer;
        this.navn=navn;
        this.sted=sted;
        this.arrangor=arrangor;
        this.type=type;
        this.tidspunkt=tidspunkt;
    }

    public int getNummer() {
        return this.nummer;
    }

    public String getNavn() {
        return this.navn;
    }

    public String getSted() {
        return this.sted;
    }

    public String getArrangor() {
        return this.arrangor;
    }

    public String getType() {
        return this.type;
    }

    public long getTidspunkt(){
        return this.tidspunkt;
    }

    public int getDato(){
        return Integer.parseInt((""+this.tidspunkt).substring(0,8));
    }

}