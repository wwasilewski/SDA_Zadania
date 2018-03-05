package tydzien2.sobota.interfejsy2;

public class Czlowiek implements Czytaj, Pisz
{

    @Override
    public void czytaj()
    {
        System.out.println("czlowiek czyta");
    }

    @Override
    public void pisz()
    {
        System.out.println("czlowiek pisze");
    }
}
