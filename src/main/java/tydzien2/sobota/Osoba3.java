package tydzien2.sobota;

public class Osoba3
{
    private String imie;
    private String nazwisko;

    public Osoba3(String imie, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void opiszSie()
    {
        System.out.println("Jestem abstrakcyjny i mam na imie: " + imie);
    }


}
