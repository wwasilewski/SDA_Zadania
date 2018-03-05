//Wykorzystaj pulę wątków (5 wątków). Niech każdy z wątków po uruchochomieniu
//losuje czas uśpienia z zakresu 1-5 sekund u usypia się. Po wybudzeniu każdy wątek
//powinien wyświetlić losową godzinę w postaci 12h13m14s34ms

package tydzien3.sobota;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zadanie17
{
    public static void main(String[] args)
    {
        ExecutorService exservice = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++)
        {
            exservice.execute(new Runnable()
            {
                @Override
                public void run()
                {
                    int czasUspienia = 0;
                    Random random = new Random();
                    czasUspienia = random.nextInt(4000) + 1000;

                    try
                    {
                        Thread.sleep(czasUspienia);
                        LocalTime localtime = LocalTime.now();
                        System.out.println("watek nr: " + Thread.currentThread().getName() + " i czas: " + localtime
                        .format(DateTimeFormatter.ofPattern("HH'h'mm'm'ss's'SS'ms'")));
                    }
                    catch (InterruptedException e)
                    {
                        e.getMessage();
                    }
                }
            });
        }
        exservice.shutdown();
    }
}
