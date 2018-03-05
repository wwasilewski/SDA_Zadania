package tydzien3.niedziela.thread;

public class Implementacja implements Runnable
{

    Thread t;

    public Implementacja()
    {
        t = new Thread(this, "nowy watek");
        System.out.println("nowy watku: " + t);
        t.start();
    }

    public void run()
    {
        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println("nowy watek: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano dzialanie nowego watku" + "%n" + e);
        }
        System.out.println("koniec nowego watku");
    }
}
