package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie6Run
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj numer seryjny do sprawdzenia: ");
        String ciagUsera = sc.nextLine();

        Zadanie6 zad6 = new Zadanie6();
        Boolean wynik = zad6.sprawdz(ciagUsera);
        System.out.println("numer seryjny poprawny?: " + wynik);

        sc.close();
    }
}
