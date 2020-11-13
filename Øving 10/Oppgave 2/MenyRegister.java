import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class MenyRegister {

    private ArrayList<Meny> register;

    public MenyRegister() {
        this.register = new ArrayList<Meny>();
    }

    public void LeggTilMeny(Meny meny) {
        this.register.add(meny);
    }

    public boolean RegistrerRett(Rett r, String navn) {
        for (int i = 0; i < this.register.size(); i++) {
            if (register.get(i).getMenyNavn().equals(navn.trim())) {
                for (int j = 0; j < this.register.get(i).getMenyer().size(); j++) {
                    if (register.get(i).getMenyer().get(j).equals(r))
                        return false;
                }
                register.get(i).LeggTilRett(r);
                return true;
            }
        }
        return false;
    }

    public String FinnRettGittNavn(String navn) {
        String utskrift = "";
        for (int i = 0; i < this.register.size(); i++) {
            for (int j = 0; j < this.register.get(i).getMenyer().size(); j++) {
                if (this.register.get(i).getMenyer().get(j).getNavn().equals(navn.trim())) {
                    utskrift += this.register.get(i).getMenyer().get(j).toString();
                }
            }
        }
        return utskrift;
    }

    public String FinnRettGittType(String type) {
        String utskrift = "";
        for (int i = 0; i < this.register.size(); i++) {
            for (int j = 0; j < this.register.get(i).getMenyer().size(); j++) {
                if (this.register.get(i).getMenyer().get(j).getType().equals(type.trim())) {
                    utskrift += this.register.get(i).getMenyer().get(j).toString();
                }
            }
        }
        return utskrift;
    }

    public String FinnMenyerMedPris(int a, int b) {
        String utskrift = "";
        for (int i = 0; i < this.register.size(); i++) {
            if (this.register.get(i).getMenyPris() > a && this.register.get(i).getMenyPris() < b) {
                utskrift += this.register.get(i).getMenyNavn() + "\r\n";
            }
        }
        return utskrift;
    }

}