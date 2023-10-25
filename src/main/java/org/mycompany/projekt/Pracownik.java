package org.mycompany.projekt;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int id;
    private KontoBankowe kontoBankowe;

    public Pracownik(String imie, String nazwisko, int id, String kontoBankoweNazwaBanku, String kontoBankoweNumer)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.id=id;
        this.kontoBankowe= new KontoBankowe(kontoBankoweNazwaBanku,kontoBankoweNumer);
    }
    public void wyswietl()
    {
        System.out.println("Dane podstawowe pracownika:");
        System.out.println("Imie: " + imie +"\nNazwisko: " + nazwisko + "\nId: " + id);
        System.out.println("Dane konta pracownika:");
        kontoBankowe.wyswietl();

    }
}
