package tydzien2.niedziela.zadania;

public class Zadanie1
{
    static int tab[] = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args)
    {
        System.out.println(tab.length);
        for (int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = 2*tab[i];
            System.out.println(tab[i]);
        }

    }
}
