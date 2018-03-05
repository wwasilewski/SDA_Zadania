package tydzien3.niedziela.thread;

public class TrzyNoweWatki implements Runnable
{

    String nazwa;
    Thread t;

    public TrzyNoweWatki(String nazwaWatku)
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
            for (int i = 5; i >= 1; i--)
            {
                System.out.println(nazwa + ": " + i);
                Thread.sleep(1000);
//                t.setPriority(i);
//                System.out.println("priorytet: " + t.getPriority()); //do ustawiania priorytetow watkow
            }

        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano " + nazwa + "%n" + e);
        }
        System.out.println("koniec watku " + nazwa);
    }
}
