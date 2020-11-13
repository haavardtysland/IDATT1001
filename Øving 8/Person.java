
final class Person {
String fornavn;
String etternavn;
int fdato;

Person (String fornavn, String etternavn, int fdato) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.fdato = fdato;
}

public String getFornavn() {
    return this.fornavn;
}

public String getEtternavn() {
    return this.etternavn;
}

public int getFdato(){
    return this.fdato;
}

} //Person class slutt