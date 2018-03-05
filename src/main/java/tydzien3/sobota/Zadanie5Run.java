package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie5Run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj date do sprawdzenia: ");
        String ciagUsera = sc.nextLine();

        Zadanie5 zad5 = new Zadanie5();
        Boolean wynik = zad5.sprawdz(ciagUsera);
        System.out.println("czy podana data ma format DD.MM.YYYYr.? " + wynik);

        sc.close();
    }
}
