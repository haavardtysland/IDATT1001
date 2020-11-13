import java.util.ArrayList;

class Student {
    private final String navn;
    private int antOppg;

    Student(String n, int a) {
        this.navn = n;
        this.antOppg = a;
    }

    public String getNavn() {
        return this.navn;
    }

    public int getAntOppg() {
        return this.antOppg;
    }

    public void okAntOppg(int okning) {
        this.antOppg += okning;
    }

    public String toString() {
        return this.navn + " har gjennomført " + this.antOppg + " oppgaver.";
    }
} // class slutt