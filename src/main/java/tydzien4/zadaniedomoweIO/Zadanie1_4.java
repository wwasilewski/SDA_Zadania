//Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
//wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
//metodę readAllLines klasy Files

package tydzien4.zadaniedomoweIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zadanie1_4
{
    public static void wyswietlWszystkieLiniePliku (String sciezka)
    {
        try
        {
            Path file = Paths.get (sciezka);
            List <String> lines = Files.readAllLines(file);

            System.out.println("wczytany tekst, linijka po linijce: ");
            for (String x : lines)
            {
                System.out.println(x);
            }

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        System.out.print("podaj sciezke do dowolnego pliku tekstowego: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        wyswietlWszystkieLiniePliku(sciezka);

        sc.close();
    }
}
