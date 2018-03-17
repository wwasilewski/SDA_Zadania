//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy wprowadzona
//liczba jest liczbą pierwszą. Program wyświetla komunikat
//“Podana liczba <liczba> jest liczbą pierwszą”
//lub “Podana liczba <liczba> nie jest liczbą pierwszą”

package Programowanie1.tydzien2.sobota.Ogolne;

import java.util.Scanner;

public class Ogolne_2_PrimeNumberRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number (int) to check: ");
        int number = sc.nextInt();

        Ogolne_2_PrimeNumber zad2 = new Ogolne_2_PrimeNumber();
        Boolean result = zad2.isPrime(number);
        if (result) {
            System.out.println("Podana liczba " + number + " jest liczba pierwsza");
        } else {
            System.out.println("Podana liczba " + number + " nie jest liczba pierwsza");
        }
        sc.close();
    }
}
