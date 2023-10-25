package org.mycompany.projekt;

public class KontoBankowe {
    private String nazwaBanku;
    private String numer;
    public KontoBankowe(String nazwaBanku, String numer)
    {
        this.nazwaBanku=nazwaBanku;
        this.numer=numer;
    }
    public void wyswietl()
    {
        System.out.println("Nazwa Banku: "+ nazwaBanku + "\nNumer konta: "+numer);
    }
}
