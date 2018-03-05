//Przygotuj aplikację, która pobiera od użytkownika ścieżkę do katalogu a następnie
//wyświetla ilość plików w wprowadzonym katalogu.

package tydzien4.zadaniedomoweIO;

import java.io.File;
import java.util.Scanner;

public class Zadanie1_8 {

    public static void ilePlikowWKatalogu(String sciezka) {
        File file = new File(sciezka);
        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("ilosc plikow w podanym katalogu: " + file.list().length);
            } else {
                System.out.println("katalog jest pusty");
            }
        } else {
            System.out.println("to nie jest katalog");
        }
    }

    public static void main(String[] args) {
        System.out.println("podaj sciezke do katalogu ktorego ilosc plikow chcesz zobaczyc: ");
        Scanner sc = new Scanner(System.in);
        String sciezka = sc.nextLine();

        ilePlikowWKatalogu(sciezka);

        sc.close();
    }
}
