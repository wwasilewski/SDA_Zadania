package tydzien2.niedziela.zadania;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Zadanie12
{
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, Month.MAY,01);
        LocalDate date2 = LocalDate.of(2017,9,05);

        Period period = Period.between(date1,date2);
        System.out.println(period.toString());

        System.out.println(Period.between(date1,date2));

        System.out.println(ChronoUnit.MONTHS.between(date1,date2));
        System.out.println(ChronoUnit.DAYS.between(date1,date2));
    }
}
