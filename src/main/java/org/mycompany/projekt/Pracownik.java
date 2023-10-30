package org.mycompany.projekt;

public class Pracownik extends Osoba
{
    //private String imie; //dziedzicze po Osoba
    //private String nazwisko; //dziedzicze po osoba
    private int id;


    public Pracownik(String imie, String nazwisko, int id)
    {
        //to jest wywolanie konstruktora z klasy osoba
        //czyli uzupelnienie imie i nazwiska pracownika
        super(imie,nazwisko);
        this.id=id;

    }

    public void drukuj()
    {
        //to jest wywolanie metody drukuj z klasy osoba(wydrukowanie iminia i nazwiska)
        super.drukuj();
        System.out.println("Id: "+id);

    }



}
