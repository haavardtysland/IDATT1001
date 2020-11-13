
import java.util.*;

public class Oving6_4 {
    public static void main(String[] args) {
        int[][] matriseB = { { 3, 4, 1 }, { 8, 3, 1 }, { 3, 2, 1 } };
        int[][] matriseA = { { 2, 1, 4 }, { 4, 2, 1 }, {2, 2, 2}};

        Matrise matA = new Matrise(matriseA, matriseB);
        System.out.println("Matrisen A ser slik ut:");
        for (int i = 0; i < matriseA.length; i++) {
            System.out.println(Arrays.toString(matriseA[i]));
        }
        System.out.println("Matrise B ser slik ut:");
        for (int i = 0; i < matriseB.length; i++) {
            System.out.println(Arrays.toString(matriseB[i]));
        }
        System.out.println("Matrise A transponert er:");
        for (int[] row : matA.Transponere()) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Matrise A + Matrise B er :");
        if (matriseA.length != matriseB.length || matriseA[0].length != matriseB[0].length) {
            System.out.println("Kan ikke addere matrisene fordi de ikke har samme dimensjoner");
        } else {

            for (int[] row : matA.Addere()) {
                System.out.println(Arrays.toString(row));
            }
        }
        System.out.println("Matrise A * Matrise B er :");
        if (matriseA[0].length != matriseB.length) {
            System.out.println("Kan ikke multiplisere matrisene fordi dimensjonene ikke stemmer");
        } else {
            for (int[] row : matA.Multiplisere()) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}

final class Matrise {
    public final int[][] matriseA;
    public final int[][] matriseB;

    Matrise(int[][] a, int[][] b) {
        this.matriseA = a;
        this.matriseB = b;
    }

    public int[][] Addere() {
        int[][] nyMatrise = new int[this.matriseA.length][this.matriseA[0].length];
        for (int i = 0; i < this.matriseA.length; i++) {
            for (int k = 0; k < this.matriseA[i].length; k++) {
                nyMatrise[k][i] = this.matriseA[k][i] + this.matriseB[k][i];
            }
        }
        return nyMatrise;
    }

    public int[][] Multiplisere() {
        int[][] nyMatrise = new int[this.matriseA.length][this.matriseB[0].length];
        int sum = 0;
        for (int i = 0; i < nyMatrise.length; i++) {
            for (int k = 0; k < nyMatrise[i].length; k++) {
                for (int s = 0; s < this.matriseB.length; s++) {
                    sum += this.matriseA[i][s] * this.matriseB[s][k];
                }
                nyMatrise[i][k] = sum;
                sum = 0;
            }
        }
        return nyMatrise;
    }

    public int[][] Transponere() {
        if (this.matriseA.length < this.matriseA[0].length || this.matriseA.length > this.matriseA[0].length) {
            int[][] nyMatrise = new int[this.matriseA[0].length][this.matriseA.length];
            for (int i = 0; i < nyMatrise.length; i++) {
                for (int k = 0; k < nyMatrise[0].length; k++) {
                    nyMatrise[i][k] = this.matriseA[k][i];
                }
            }
            return nyMatrise;
        } else {
            int[][] nyMatrise = new int[this.matriseA.length][this.matriseA[0].length];
            for (int i = 0; i < this.matriseA.length; i++) {
                for (int k = 0; k < this.matriseA[i].length; k++) {
                    nyMatrise[k][i] = this.matriseA[i][k];
                }
            }
            return nyMatrise;
        }
    }
}