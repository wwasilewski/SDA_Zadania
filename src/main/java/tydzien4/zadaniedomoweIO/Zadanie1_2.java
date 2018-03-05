//Przygotuj aplikację, która pobiera od użytkownika ścieżkę do pliku i zapisuje w nim
//tekst “<== Hello world ==>”

package tydzien4.zadaniedomoweIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie1_2
{
    public static void zapisDoPlikuPoSciezce(String sciezka)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter(sciezka));

            writer.write("<== Hello world ==>");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("podaj sciezke od pliku: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        zapisDoPlikuPoSciezce(sciezka);

        sc.close();
    }
}
