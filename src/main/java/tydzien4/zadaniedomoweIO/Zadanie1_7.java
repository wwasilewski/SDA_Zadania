//Przygotuj aplikację, która pobiera od użytkownika nazwę katalogu do utworzenia.
//Program powinien utworzyć podany przez użytkownika katalog na dysku twardym.

package tydzien4.zadaniedomoweIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie1_7
{
    public static void utworzKatalog (String sciezka)
    {
        Path path = Paths.get(sciezka);

        if(!Files.exists(path))
        {
            try
            {
                Files.createDirectories(path);
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("program do tworzenia katalogu na dysku, podaj cala sciezka katalogu: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        utworzKatalog(sciezka);

        sc.close();
    }
}
