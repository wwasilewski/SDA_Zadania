package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie2Run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj ciag do sprawdzenia czy jest kodem pocztowym: ");
        String ciagUsera = sc.nextLine();

        Zadanie2 zad2 = new Zadanie2();
        Boolean ciagPoprawny = zad2.sprawdz(ciagUsera);

        System.out.println(ciagPoprawny);

        if (ciagPoprawny)
        {
            System.out.println("poprawny kod pocztowy");
        }
        else
        {
            System.out.println("niepoprawny kod pocztowy");
        }
        sc.close();
    }
}
