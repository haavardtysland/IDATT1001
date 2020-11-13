
import java.util.*;

public class Oving6_3 {
    public static void main(String[] args) {

        double[][] mnd = { { 5, 6, 7, 8 }, { 5, 7, 8, 6 }, { -5, 3, 2, -18 }, {12, 18, 23, 19} }; // satt opp
                                                                                                           // tre dager,
                                                                                                           // med 4
                                                                                                           // timer satt
                                                                                                              // opp og
                                                                                                           // temperaturen
                                                                                                           // for de

        Temperaturer t1 = new Temperaturer(mnd);
        System.out.println(t1.hverDagIMnd()); // a
        System.out.println(t1.hverTimeIMnd()); // b
        System.out.println("Gjennomsnittstemperaturen for hele måneden er: " + t1.heleMnd());// c
       System.out.println(t1.antallDogn()); //d

    }// main slutt
}// class slutt

class Temperaturer {
    private double[][] array;

    Temperaturer(double[][] a) {
        this.array = a;
    }

    public String hverDagIMnd() {
        double[] tempArr = new double[this.array.length];
        String skrivUt = "Gjennomsnittstemperaturen for de forskjellige dagene er:\r\n";
        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array[i].length; k++) {
                tempArr[i] += this.array[i][k] /tempArr.length;
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            skrivUt += "Dag " + (i + 1) + ": " + tempArr[i] + "\r\n";
        }
        return skrivUt;
    }

    public String hverTimeIMnd() {
        double[] tempArr = new double[this.array[0].length];
        String skrivUt = "Gjennomsnittstemperaturen for de forskjellige timene er:\r\n";
        for (int i = 0; i < tempArr.length; i++) {
            for (int k = 0; k < this.array.length; k++) {
                tempArr[i] += this.array[k][i]/this.array.length;
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            skrivUt += "Time " + (i + 1) + ": " + tempArr[i] + "\r\n";
        }
        return skrivUt;
    }

    public double heleMnd() {
        double totaltemp = 0;
        double midtemp = 0;
        int total = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array.length; k++) {
                totaltemp += this.array[i][k];
                total++;
            }
        }
        midtemp = (totaltemp) / (total);
        return midtemp;
    }
    public String antallDogn() {
        double[] tempArr = new double[this.array.length];
        String skrivUt = "\r\nAntall dager innenfor de forskjellige gruppene:";
        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array[i].length; k++) {
                tempArr[i] += this.array[i][k] /tempArr.length;
            }
        }
        for (int i = 0; i < this.array.length; i++ ) {
            if (tempArr[i] < -5) {
                skrivUt+= "\r\nMindre enn 5 grader: Dag " + (i+1);
            } else if (tempArr[i] >= -5 && tempArr[i] < 0) {
                skrivUt+="\r\nMellom -5 og 0 grader: Dag " + (i+1);
            } else if (tempArr[i] >= 0 && tempArr[i] < 5) {
                skrivUt+="\r\nMellom 0 og 5 grader: Dag " + (i+1);
            } else if (tempArr[i] >=5 && tempArr[i] < 10) {
                skrivUt+="\r\nMellom 5 og 10 grader: Dag " + (i+1);
            } else {
                skrivUt+="\r\nStørre enn 10 grader: Dag " + (i+1);
            }
        }
        return skrivUt;
    }
}
