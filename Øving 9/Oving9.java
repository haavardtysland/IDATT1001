import java.util.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class Oving9 {
    public static void main(String[] args) {

        Oppgaveoversikt oversikt = new Oppgaveoversikt();
        Student s1 = new Student("Jakob", 3);
        oversikt.RegistrerStudent(s1);
        System.out.println(oversikt.toString());

        Student s2 = new Student("Mads", 8);
        Student s3 = new Student("Cato", 2);
        oversikt.RegistrerStudent(s2);
        oversikt.RegistrerStudent(s3);
        System.out.println(oversikt.toString());
        oversikt.okAntOppgStud(s2, 3); // Øker Mads sine oppgaver med 3
        System.out.println("Mads har nå " + s2.getAntOppg() + " oppgaver");
        System.out.println("Det er " + oversikt.getAntStud() + " studenter");

    }
}