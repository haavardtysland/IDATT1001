import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.*;
import java.util.Comparator;


public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    public ArrangementRegister() {
        this.arrangementer = new ArrayList<Arrangement>();
    }

    public void RegistrerArrangement(Arrangement arr) {
        this.arrangementer.add(arr);
    }

    public String ArrangementPaaSted(String sted) {
        String tekst = "Arrangementene som er på " + sted + ": \r\n";
        ArrayList<String> utskrift = new ArrayList<String>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getSted().equals(sted)) {
               utskrift.add(this.arrangementer.get(i).getNavn());
            }
        }
        return tekst + Arrays.toString(utskrift.toArray());
    }

    public String ArrangementPaaDato(int dato) {
        String tekst = "Arrangementene på datoen " + dato + ": \r\n";
        ArrayList<String> utskrift = new ArrayList<String>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getDato() == dato) {
                utskrift.add(this.arrangementer.get(i).getNavn());
            }
        }
        return tekst + Arrays.toString(utskrift.toArray());
    }

    public String ArrangementMellomDato(int dato1, int dato2) {
        String tekst = "Arrangementene mellom datoene " + dato1 + " og " + dato2 + " er: \r\n";
        List<Arrangement> navn = this.arrangementer;
        ArrayList<String> utskrift = new ArrayList<String>();
        long storst = 0L;
        int index = 0;
            for (int i = 0; i < this.arrangementer.size(); i++){
                for (int l = 0; l < navn.size(); l++){
                if (this.arrangementer.get(l).getDato() < dato1 ||this.arrangementer.get(l).getDato() > dato2) {
                    navn.remove(l);
                    }
                }
            }
            int antall = navn.size();
            for (int k = 0; k < antall; k++) {
                for (int j = 0; j < navn.size(); j++) {
                    if (navn.get(j).getTidspunkt() >= storst) {
                        storst=navn.get(j).getTidspunkt();
                        index = j;
                    }
                utskrift.add(navn.get(index).getNavn());
                navn.remove(index);
                storst = 0;
                }
            }       
            Collections.reverse(utskrift);
            return tekst + Arrays.toString(utskrift.toArray());
        }

    public String toString() {
        String utskrift ="";
        for (int i = 0; i < arrangementer.size(); i++){
            utskrift += "Arrangement nummer:" + this.arrangementer.get(i).getNummer() + "\r\nNavn: " + this.arrangementer.get(i).getNavn() + "\r\nSted: " + this.arrangementer.get(i).getSted()+ "\r\nArrangør: " + this.arrangementer.get(i).getArrangor() + "\r\nType:"  + this.arrangementer.get(i).getType() + "\r\nTidspunkt: " + this.arrangementer.get(i).getTidspunkt() + "\r\n\r\n";
        }
        return utskrift;
    }

    public String AlleArrangement(){
    Collections.sort(arrangementer,new Comparator<Arrangement>(){
        public int compare(Arrangement a1, Arrangement a2) {
            return Long.compare(a1.getTidspunkt(), a2.getTidspunkt());
        }
    });
        Collections.sort(arrangementer,new Comparator<Arrangement>(){
        public int compare(Arrangement a1, Arrangement a2) {
            return a1.getType().compareTo(a2.getType());
        }
    }); 
            Collections.sort(arrangementer,new Comparator<Arrangement>(){
        public int compare(Arrangement a1, Arrangement a2) {
            return a1.getSted().compareTo(a2.getSted());
        }
    });
        return this.toString();

}
}