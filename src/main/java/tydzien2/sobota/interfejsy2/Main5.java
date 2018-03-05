package tydzien2.sobota.interfejsy2;

public class Main5
{
    public static void main(String[] args)
    {
        Czytaj czyt = new Czlowiek();
        czyt.czytaj();
        Pisz pisz = (Pisz) czyt;
        pisz.pisz();
    }
}
