package tydzien1.zadaniedomowe;

public class Zadanie6
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
        //wypisz(0,funkcja(0));
        for (int i = 1; i < 21; i++)
        {
            funkcja(i);
            wypisz(i/2.0,funkcja(i/2.0));
        }
    }

}
