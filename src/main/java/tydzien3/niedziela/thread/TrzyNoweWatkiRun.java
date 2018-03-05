package tydzien3.niedziela.thread;

public class TrzyNoweWatkiRun
{
    public static void main(String[] args)
    {
        new TrzyNoweWatki("pierwszy watek");
        new TrzyNoweWatki("drugi watek");
        new TrzyNoweWatki("trzeci watek");

        try
        {
            Thread.sleep(8000);
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano watek glowny" + "%n" + e);
        }
        System.out.println("koniec watku glownego");
    }
}
