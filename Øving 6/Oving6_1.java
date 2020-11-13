import java.util.Random;
import java.util.*;

public class Oving6_1 {
    public static void main(String[] args) {
        int[] antall = new int[10];
        Random random = new Random();
        for (int i = 1; i <= 1000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }
       int a = 1;
        for (int x:antall) {
            System.out.println(a + " " + x);
            a++;
        }
    }
}
