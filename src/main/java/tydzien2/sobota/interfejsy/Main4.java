package tydzien2.sobota.interfejsy;

public class Main4
{
    public static void main(String[] args)
    {
        Pojazd pojazd = new Amfibia();
        pojazd.jedz();
        Lodz lodka = (Lodz) pojazd;
        lodka.plyn();
    }
}
