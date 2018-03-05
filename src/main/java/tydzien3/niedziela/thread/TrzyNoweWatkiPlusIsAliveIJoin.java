package tydzien3.niedziela.thread;

public class TrzyNoweWatkiPlusIsAliveIJoin implements Runnable
{

    String nazwa;
    Thread t;

    public TrzyNoweWatkiPlusIsAliveIJoin(String nazwaWatku)
    {
        nazwa = nazwaWatku;
        t = new Thread(this, nazwa);
        System.out.println("nowy watek: " + t);
        t.start();
    }

    public void run()
    {
        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println(nazwa + ": " + i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano " + nazwa + "%n" + e);
        }
        System.out.println("koniec watku " + nazwa);
    }
}
