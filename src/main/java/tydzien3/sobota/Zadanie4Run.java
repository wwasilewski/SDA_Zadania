package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie4Run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj ciag do sprawdzenia: ");
        String ciagUsera = sc.nextLine();

        Zadanie4 zad4 = new Zadanie4();
        Boolean wynik = zad4.sprawdz(ciagUsera);
        System.out.println("czy ciag zawiera wyraz \"ala\"? " + wynik);

        sc.close();
    }
}
