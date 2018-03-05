//Przygotuj aplikację, która wczytuje i wyświetla zawartość pliku example.txt

package tydzien4.zadaniedomoweIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Zadanie1_3
{
    public static void wczytajWszystkieLiniePliku()
    {
        try
        {
            Path file = Paths.get("C:\\Users\\wwasi\\Desktop\\Jungla_Calosc\\pliki\\example.txt");
            List <String> lines = Files.readAllLines(file);

            System.out.println("wczytane linie: ");
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
        wczytajWszystkieLiniePliku();
    }
}
