package tydzien1.zadaniedomowe;

public class Zadanie5
{
    static double funkcja(double x)
    {
        return x*x+3;
    }

    static void wypisz(double x, double y)
    {
        System.out.println("dla x = " + x + " y = " + y);
    }

    public static void main(String[] args)
    {
        for (int i = 1; i < 21; i++)
        {
            funkcja(i);
            if (i%2 == 0) // wypisuje tylko parzyste
            {
                wypisz(i,funkcja(i));
            }
        }
    }

}
