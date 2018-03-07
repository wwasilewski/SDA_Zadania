/*
 * Created by Wojciech Wasilewski
 */

//Dodaj 10 losowych liczb do kolekcji. Korzystając z indeksów pobierz po kolei
//wszystkie elementy i wyświetl je.

package Programowanie1.tydzien1.niedziela.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kolekcje_2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            System.out.println("liczba nr" + (i + 1) + " to: " + list.get(i));
        }
    }
}
