//Przygotuj aplikację kopiującą plik z jednej lokalizacji do innej. Program prosi
//użytkownika o wprowadzenie nazwy (ścieżki) pliku do skopiowania oraz nazwy
//(ścieżki) do której plik ma zostać skopiowany.

package tydzien4.zadaniedomoweIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Zadanie1_9
{
    public static void skopiujPlik (String sciezkaZ, String sciezkaDo)
    {
        Path source = Paths.get(sciezkaZ);
        Path destination = Paths.get(sciezkaDo);

        try
        {
            Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj sciezke pliku ktory chcesz skopiowac: ");
        String sciezkaZ = sc.nextLine();

        System.out.println("podaj sciezke gdzie chcesz skopiowac plik: ");
        String sciezkaDo = sc.nextLine();

        skopiujPlik(sciezkaZ, sciezkaDo);

        sc.close();
    }
}
