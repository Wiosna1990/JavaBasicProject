package org.mycompany.projekt;
// pracownik biurowy jest pracownikiem,zatem dziedziczy po pracowniku
public class PracownikBiurowy extends Pracownik
{
    private String numerBiura;

    public PracownikBiurowy(String imie,String nazwisko, int id, String numerBiura)
    {
        //to jest wywolanie konstruktora z klasy Pracownik
        super(imie,nazwisko,id);
        this.numerBiura = numerBiura;

    }
    public void drukuj()
    {
        //to jest wywolanie metody drukuj z klasy Pracownik, czyli wydrukownaie imie,nazwiska,id PracownikaBiurowego
        super.drukuj();
        System.out.println("Numer biura: " + numerBiura);
    }

}
