package tydzien2.sobota;

public class Osoba
{
    private int wzrost;
    private int waga;
    private String imie;
    private String nazwisko;
    private static String uczelnia = "WSB";

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void ustawDomyslneNazwisko()
    {
        this.nazwisko = "Kowalski";
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public static void main(String[] args)
        {
            System.out.println("cos");
        }

}