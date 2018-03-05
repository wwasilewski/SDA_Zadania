package tydzien1.zadaniedomowe;

public class Zadanie2
{
    static int nrLinii = 1;

    static void wypisz(String tekst)
    {
        System.out.println(nrLinii + ": " + tekst);
        nrLinii++;
    }

//    static void wypisz()
//    {
//        int nrLinii = 1;
//        String dni[] = {"Poniedzialek","Wtorek","Sroda","Czwartek","Piatek","Sobota","Niedziela"};
//        for (int i = 0; i < dni.length; i++)
//        {
//            System.out.println((nrLinii+i) + ": " + dni[i]);
//        }
//    }

    public static void main(String [] args)
    {
        String dni[] = {"Poniedzialek","Wtorek","Sroda","Czwartek","Piatek","Sobota","Niedziela"};
//      wypisz("costam");
//      wypisz("costam2");

        for (int i = 0; i < dni.length; i++)
        {
            wypisz(dni[i]);
        }

    }
}