import java.util.ArrayList;
import java.util.List;

class Oppgaveoversikt {
    private List<Student> studenter;

    Oppgaveoversikt() {
        this.studenter = new ArrayList<Student>();
    }

    public List<Student> getStudenter() {
        return this.studenter;
    }

    public int getAntStud() {
        return this.studenter.size();
    }

    public void okAntOppgStud(Student student, int okning) {
        student.okAntOppg(okning);
    }

    public int antOppgLostStud(Student student) {
        return student.getAntOppg();
    }

    public void RegistrerStudent(Student stud) {
        studenter.add(stud);
    }

    public String toString() {
        String result = "Oppgaveoversikt \r\nAntall studenter: " + getAntStud() + "\r\nStudenter: \r\n";
        for (Student stud : this.studenter) {
            result += stud.toString() + "\r\n";
        }
        return result;
    }
}