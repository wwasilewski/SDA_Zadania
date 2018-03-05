package tydzien2.niedziela.zadania;

import java.time.Duration;
import java.time.LocalTime;

public class Zadanie13
{
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(14,11);
        LocalTime time2 = LocalTime.of(18,41);

        Duration duration = Duration.between(time1,time2);
        System.out.println(duration.toString());

        System.out.println(Duration.between(time1,time2));
    }
}
