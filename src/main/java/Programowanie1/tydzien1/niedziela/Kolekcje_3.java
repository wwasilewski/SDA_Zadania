//Utwórz kolejkę osób do lekarza. Dodaj 10 losowych osób i wyświetl pierwsza i
//ostatnią osobę z kolejki. Nie korzystaj z listy ArrayList.

package Programowanie1.tydzien1.niedziela;

import java.util.*;

public class Kolekcje_3 {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();
        String person = "person";
        for (int i = 0; i < 10; i++) {
            queue.add(person + (i + 1));
        }
        System.out.println("all persons: \n" + queue);
        System.out.println("first person: " + queue.getFirst());
        System.out.println("last person: " + queue.getLast());
    }
}

