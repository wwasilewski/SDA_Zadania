package tydzien3.niedziela.thread;

public class ImplementacjaRun
{
    public static void main(String[] args)
    {
        new Implementacja();

        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println("watek glowny: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano dzialanie watku glownego" + "%n" + e);
        }
        System.out.println("koniec watku glownego");
    }
}
