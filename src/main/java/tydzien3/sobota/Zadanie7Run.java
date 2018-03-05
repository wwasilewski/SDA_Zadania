package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie7Run
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj numer seryjny do sprawdzenia: ");
        String ciagUsera = sc.nextLine();

        Zadanie7 zad7 = new Zadanie7();
        Boolean wynik = zad7.sprawdz(ciagUsera);
        System.out.println("czy podany numer jest poprawny?: " + wynik);

        sc.close();
    }
}
