package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie9Run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ciag do sprawdzenia: ");
        String ciag = sc.nextLine();

        Zadanie9 zad9 = new Zadanie9();

        String []costam = zad9.podziel(ciag);
//        int znaki = zad9.ileZnakow(ciag);
//        float srednia = zad9.srednia(ciag);

        for (String t : costam)
        {
            System.out.println(t);
        }

        System.out.println("Ilość słów: " + costam.length);
        System.out.println("Ilość wprowadzonych znaków: " + zad9.ileZnakow(ciag));
        System.out.println("Średnia długość wprowadzonego słowa: " + zad9.srednia(ciag));
        System.out.println("Najdłuższe słowo: " + zad9.longest(costam));
        System.out.println("Najkrótsze słowo: " + zad9.shortest(costam));

        sc.close();
    }
}
