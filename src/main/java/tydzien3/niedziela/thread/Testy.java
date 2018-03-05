package tydzien3.niedziela.thread;

public class Testy
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("aktualny watek: " + t);

        String nazwa = t.getName();
        System.out.println("nazwa watku przed zmiana: " + nazwa);

        t.setName("nasz watek glowny");
        nazwa = t.getName();
        System.out.println("nazwa watku po zmianie: " + nazwa);

        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("koniec");
        }
        catch (InterruptedException e)
        {
            System.out.println("przerwanie watku glownego" + "%n" + e);
        }


    }
}
