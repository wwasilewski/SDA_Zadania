package tydzien3.niedziela.thread;

public class TrzyNoweWatkiPlusIsAliveIJoinRun
{
    public static void main(String[] args)
    {
        TrzyNoweWatkiPlusIsAliveIJoin w1 = new TrzyNoweWatkiPlusIsAliveIJoin("pierwszy watek");
        TrzyNoweWatkiPlusIsAliveIJoin w2 = new TrzyNoweWatkiPlusIsAliveIJoin("drugi watek");
        TrzyNoweWatkiPlusIsAliveIJoin w3 = new TrzyNoweWatkiPlusIsAliveIJoin("trzeci watek");

        System.out.println("czy 1 watek zyje? " + w1.t.isAlive());
        System.out.println("czy 2 watek zyje? " + w2.t.isAlive());
        System.out.println("czy 3 watek zyje? " + w3.t.isAlive());

        try
        {
            System.out.println("oczekiwanie na zakonczenie watkow");
            w1.t.join();
            w2.t.join();
            w3.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwano prace watku glownego" + "%n" + e);
        }

        System.out.println("czy 1 watek zyje? " + w1.t.isAlive());
        System.out.println("czy 2 watek zyje? " + w2.t.isAlive());
        System.out.println("czy 3 watek zyje? " + w3.t.isAlive());

        System.out.println("koniec watku glownego");
    }
}
