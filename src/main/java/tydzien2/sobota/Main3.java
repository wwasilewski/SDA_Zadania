package tydzien2.sobota;

public class Main3
{
    public static void main(String[] args)
    {
        Zwierze lew = new Lew("simba");
        Zwierze slon = new Slon("marek");

        lew.dajGlos();
        slon.dajGlos();
        System.out.println("zwierze " + lew.getNazwa() + "je " + lew.ileJe());

    }
}
