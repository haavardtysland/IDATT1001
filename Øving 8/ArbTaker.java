
class ArbTaker {
Person person;
int arbtakernr;
int ansettelsesaar;
double maanedslonn;
double skatteprosent;

ArbTaker(Person startPerson, int arbtakernr, int ansettelsesaar, double maanedslonn, double skatteprosent) {
    this.person = startPerson;
    this.arbtakernr=arbtakernr;
    this.ansettelsesaar=ansettelsesaar;
    this.maanedslonn=maanedslonn;
    this.skatteprosent=skatteprosent;
}

public int getArbtakernr() {
    return this.arbtakernr;
}

public void setArbtakernr(int nyttArbtakernr){
    this.arbtakernr=nyttArbtakernr;
}

public int getAnsettelesAar(){
    return this.ansettelsesaar;
}

public void setAnsettelsesAar(int nyttAnsettelsesAar){
    this.ansettelsesaar=nyttAnsettelsesAar;
}

public double getMaanedslonn(){
    return this.maanedslonn;
}

public void setMaanedslonn(double nyMaanedslonn){
    this.maanedslonn=nyMaanedslonn;
}

public double getSkatteprosent(){
    return this.skatteprosent;
}

public void setSkatteprosent(double nySkatteprosent){
    this.skatteprosent=nySkatteprosent;
}

public double SkattPerMaaned(){
    return this.skatteprosent*this.maanedslonn;
}

public double BruttoLonn(){
    return this.maanedslonn*12;
}

public double SkattPerAar(){
    return (this.skatteprosent*this.maanedslonn*10)+((this.skatteprosent*this.maanedslonn)/2);
}

public String fulltNavn(){
    return this.person.getEtternavn() + "," + this.person.getFornavn();
}

public int Alder(){
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);    
    return år - person.getFdato();
}

public int aarAnsatt(){
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);    
    return år - this.ansettelsesaar; 
}

public boolean AnsattMerEnn(int aar) {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);    
    if (år - this.ansettelsesaar >= aar) {
        return true;
    } else {
        return false;
    }
}


} //ArbTaker class slutt

