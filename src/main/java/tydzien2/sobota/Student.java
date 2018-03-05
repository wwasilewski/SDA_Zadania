package tydzien2.sobota;

public class Student extends Osoba3
{
    private int numerIndeksu;

    public Student(String imie, String nazwisko, int numerIndeksu)
    {
        super(imie, nazwisko);
        this.numerIndeksu = numerIndeksu;
    }

    public void opiszSie()
    {
        System.out.println("Jestem studentem o indeksie " + numerIndeksu);
    }
}
