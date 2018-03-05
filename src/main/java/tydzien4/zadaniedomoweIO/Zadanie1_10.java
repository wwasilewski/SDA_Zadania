//Zmodyfikuj plik z poprzedniego zadania tak aby program po skopiowaniu pliku
//wyświetlał komunikat “Czy chcesz usunąć plik źródłowy [t/n]?”
//Jeśli użytkownik wprowadzi znak t to program usuwa plik, źródłowy.
//Jeśli użytkownik wprowadzi znak n to program pozostawia plik źródłowy.

package tydzien4.zadaniedomoweIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Zadanie1_10
{
    public static void skopiujPlik(String sciezkaZ, String sciezkaDo) {
        Scanner sc = new Scanner(System.in);
        String wybor = "";
        Path source = Paths.get(sciezkaZ);
        Path destination = Paths.get(sciezkaDo);

        try {
            Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (Files.exists(source)) {
            System.out.println("usunac plik bazowy? t/n");
            wybor = sc.nextLine();
            if (wybor.equals("t")) {
                try {
                    Files.delete(source);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj sciezke pliku ktory chcesz skopiowac: ");
        String sciezkaZ = sc.nextLine();

        System.out.println("podaj sciezke gdzie chcesz skopiowac plik oraz nazwe (mozesz zmienic): ");
        String sciezkaDo = sc.nextLine();

        skopiujPlik(sciezkaZ, sciezkaDo);
        sc.close();
    }
}
