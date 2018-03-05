package tydzien3.niedziela.thread;

public class Rozszerzenie extends Thread
{
    public Rozszerzenie()
    {
        super("nowy watek");
        System.out.println("nowy watek: " + this);
        start();
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println("nowy watek: " + i);
                sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano dzialanie nowego watku" + "%n" + e);
        }
        System.out.println("koniec nowego watku");
    }
}
