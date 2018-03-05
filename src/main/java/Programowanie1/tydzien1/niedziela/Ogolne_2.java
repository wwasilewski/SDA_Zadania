//Zaktualizuj program, aby umożliwiał użytkownikowi przekazanie dowolnej liczby
//parametrów.

package Programowanie1.tydzien1.niedziela;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogolne_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.print("podaj liczbe (5 konczy program): ");
        int liczba;

        while ((liczba = sc.nextInt()) != 5) {
            list.add(liczba);
            System.out.print("podaj liczbe: ");
        }

        int min = list.get(0);
        int max = list.get(0);


        for (Integer i : list) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }
        }
        System.out.println("najwieksza: " + max);
        System.out.println("najmniejsza: " + min);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("suma" + sum);

        sc.close();
    }
}
