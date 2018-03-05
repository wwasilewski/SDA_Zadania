//Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
//wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
//metodę newBufferedReader klasy Files.

package tydzien4.zadaniedomoweIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie1_5
{
    public static void wyswietlWszystkieLiniePliku (String sciezka)
    {
        try
        {
            Path file = Paths.get(sciezka);

            BufferedReader reader = Files.newBufferedReader(file);
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        System.out.print("podaj sciezke do pliku: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        wyswietlWszystkieLiniePliku(sciezka);

        sc.close();
    }
}
