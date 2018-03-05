package tydzien3.sobota;

import java.util.Scanner;

public class Zadanie8Run
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj numer faktury w formacie FV/1024/02/2018: ");
        String ciagUsera = sc.nextLine();

        Zadanie8 zad8 = new Zadanie8();
        Boolean wynik = zad8.sprawdz(ciagUsera);
        System.out.println(wynik);
    }
}
