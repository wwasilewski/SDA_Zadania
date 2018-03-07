/*
 * Created by Wojciech Wasilewski
 */

//Utwórz kolekcję z 10 imionami (W kolekcji musi pojawić się imię Jan). Korzystając
//ze strumieni znajdź imię Jan i wyświetl je.

package Programowanie1.tydzien1.niedziela.Streamy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_2 {
    public static void main(String[] args) {
        String names[] = {"Anna", "Kasia", "Basia", "Jan", "Jania", "Tomek", "Jan", "Janek", "Bamberiusz", "Janislaw"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

        namesList.stream()
                .filter(s -> s.equals("Jan"))
                .forEach(s -> System.out.println(s));
    }
}
