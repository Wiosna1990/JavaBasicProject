package org.mycompany.projekt;

public class Projekt {
    public static void main(String[] args)
    {

        Pracownik p1 = new Pracownik("Natalia","Bur",123);
        p1.drukuj();
        PracownikBiurowy pb1 = new PracownikBiurowy("Agata","Styczen", 125, "6");
        pb1.drukuj();
        Osoba o1 = new Osoba("Adam","Kot");
        System.out.println(o1.toString());
        System.out.println(p1.toString());
        System.out.println(pb1.toString());


    }



}