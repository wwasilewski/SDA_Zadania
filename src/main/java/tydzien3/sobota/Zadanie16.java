package tydzien3.sobota;

import java.util.Random;

public class Zadanie16 implements Runnable
{
    int counter = 0;
    Random random = new Random();

    @Override
    public void run()
    {
        try
        {
            while (counter < 5)
            {
                int liczba = random.nextInt(91) + 10;
                System.out.println(liczba);
                Thread.sleep(1000);
                counter++;
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("koniec");

    }
}
