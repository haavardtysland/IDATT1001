import java.util.ArrayList;
import java.util.List;

public class Oving10_2 {
    public static void main(String[] args){
        Rett r1 = new Rett("Pizza Margherita", "Hovedrett", 280, "Pizzabunn, pizzasaus, ost");
        Rett r2 = new Rett("Creme Brulée", "Dessert", 80, "vet ikke hva som er i denne");
        Rett r3 = new Rett("Nachos", "Forrett", 112, "Nachoschips, kjøttdeig, salsadip, guacamole");
        Rett r4 = new Rett("Lasagne", "Hovedrett", 180, "Ost, lasagneplater, kjøttdeig");

        Rett r5 = new Rett("Komler", "Hovedrett", 300, "Potet, mel, pølse");
        Rett r6 = new Rett("Kjøttkaker i brun saus", "Hovedrett", 220, "Kjøttkjaker, saus, potet, brokkoli");
        Rett r7 = new Rett("Blomkålsuppe", "Forrett", 90, "Toro blomkålsuppe");
        Rett r8 = new Rett("Taco", "Hovedrett", 50, "Lefse, kjøttdeig");

        Meny m1 = new Meny("MexicanoItaliano");
        m1.LeggTilRett(r1);
        m1.LeggTilRett(r2);
        m1.LeggTilRett(r3);

        Meny m2 = new Meny("Norsk hjemmelaget");
        m2.LeggTilRett(r5);
        m2.LeggTilRett(r6);
        m2.LeggTilRett(r7);
        m2.LeggTilRett(r8);

        MenyRegister register = new MenyRegister();
        
        register.LeggTilMeny(m1);
        register.LeggTilMeny(m2);

        System.out.println(register.FinnRettGittNavn("Nachos"));
        System.out.println(register.FinnRettGittNavn("Taco"));
        //System.out.println(register.RegistrerRett(r4, "MexicanoItaliano"));
        System.out.println(register.FinnRettGittType("Hovedrett"));
        System.out.println(register.FinnMenyerMedPris(500, 700));
        System.out.println(m2.menyToString());
    }
}