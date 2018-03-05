package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie3Run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj ciag do sprawdzenia: ");
        String ciagUsera = sc.nextLine();

        Zadanie3 zad3 = new Zadanie3();
        Boolean ciagPoprawny = zad3.sprawdz(ciagUsera);
        System.out.println(ciagPoprawny);

        sc.close();
    }
}
