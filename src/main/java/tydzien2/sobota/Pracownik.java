package tydzien2.sobota;

public class Pracownik extends Osoba3
{
    private int placa;

    public Pracownik(String imie, String nazwisko, int placa)
    {
        super(imie, nazwisko);
        this.placa = placa;
    }

    public void opiszSie()
    {
        System.out.println("jestem pracownikiem z placa: " + placa);
    }

    public void podwyzka(int ile)
    {
        this.placa = placa + ile;
    }
}
