//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
//jest parzysta lub nieparzysta i wyświetla stosowny komunikat.

package Programowanie1.tydzien2.sobota.Ogolne;

import java.util.Scanner;

public class Ogolne_1Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number (int) to check: ");
        int number = sc.nextInt();

        Ogolne_1 zad1 = new Ogolne_1();
        Boolean result = zad1.evenOrOdd(number);
        if (result) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        sc.close();
    }
}
