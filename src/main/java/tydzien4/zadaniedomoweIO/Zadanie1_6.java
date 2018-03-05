//Zmodyfikuj aplikację z poprzedniego zadania i do każdej wczytanej i wyświetlanej linii
//dodaj jej numer porządkowy. Przykładowo jeśli linia zawiera tekst
//“Drogi Marszałku, Wysoka Izbo. PKB rośnie.” wyświetl ją jako:
//“1: Drogi Marszałku, Wysoka Izbo. PKB rośnie.“

package tydzien4.zadaniedomoweIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie1_6
{
    public static void wyswietlWszystkieLiniePliku (String sciezka)
    {
        try {
            Path file = Paths.get(sciezka);

            BufferedReader reader = Files.newBufferedReader(file);
            String line = null;

            for (int i = 1; ((line = reader.readLine()) != null); i++)
            {
                System.out.println(i + ": " + line);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("podaj sciezke do pliku: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        wyswietlWszystkieLiniePliku(sciezka);

        sc.close();
    }
}
