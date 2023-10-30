package org.mycompany.projekt;

public class Osoba
{
    private String imie;
    private String nazwisko;


    public Osoba(String imie,String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public void drukuj()
    {
        System.out.println("Imie "+ imie);
        System.out.println("Nazwisko "+ nazwisko);
    }
    public String toString()
    {
        return imie + " " + nazwisko ;
    }

}
