//Przygotuj aplikację, która zapisuje do pliku example.txt tekst “Hello world”.

package tydzien4.zadaniedomoweIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie1_1 {
    public static void zapisDoPlikuBW() {
        try {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("C:\\Users\\wwasi\\Desktop\\Jungla_Calosc\\pliki\\example.txt"));

            writer.write("Hello world");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        zapisDoPlikuBW();
    }
}
