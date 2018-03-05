package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie1Run
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj ciag do sprawdzenia czy jest liczba, a jesli tak to czy parzysta czy nie: ");
        String ciagUsera = sc.nextLine();

        Zadanie1 zad1 = new Zadanie1();
        Boolean ciagPoprawny = zad1.sprawdz(ciagUsera);

        try
        {
            // do sprawdzenia czy sie zgadza ze wzorcem
            System.out.println("czy wprowadzony ciag jest poprawny? (true/false) -> WYNIK: " + ciagPoprawny);
            int value = Integer.parseInt(ciagUsera);

            if (ciagPoprawny)
            {
                if (value % 2 == 0)
                {
                    System.out.println("liczba parzysta");
                }
                else
                {
                    System.out.println("liczba nieparzysta");
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("to co podales to niepoprawna liczba");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        sc.close();
    }
}
