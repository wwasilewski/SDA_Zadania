//Utwórz tablicę typu int[]. Wylosuj 20 wartości z przedziału <100,200> i wyświetl
//tablicę. Wykorzystując stream posortuj tablicę z wygenerowanymi wartościami
//rosnąco, a następnie wyświetl tablicę, *Posortuj tablicę malejąca, a następnie ją
//wyświetl.

package tydzien4.sobota;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Zadanie32
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int tablica[] = new int[6];

        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = random.nextInt(101) + 100;
        }

        System.out.println("wypisanie tablicy petla for:");
        for (int wynik : tablica)
        {
            System.out.print(wynik + " ");
        }

        System.out.println("\nposortowanie tablicy rosnaco i lambda:");
        Arrays.stream(tablica).sorted()
                .forEach(e -> System.out.print(e + " "));


        tablica = IntStream.of(tablica)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i )
                .toArray();

        System.out.println("\nzawartosc tablicy malejaco: ");

        for (int tab : tablica)
        {
            System.out.print(tab + " ");
        }
    }
}
