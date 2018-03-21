//Przygotuj program, który pobiera od użytkownika imiona i dodaje je do listy
//generycznej typu String. Koniec wprowadzania imion następuje po wprowadzeniu
//słowa “koniec”. Następnie program korzystając z pętli foreach wyświetla po kolei
//wszystkie imiona podając na końcu każdego imienia ilość znaków z których się
//składa (np. Jan (3))

package tydzien3.sobota;

import java.util.List;

public class Zadanie12Run {
    public static void main(String[] args) {
        Zadanie12 zad12 = new Zadanie12();
        List<String> list = zad12.addNames();
        zad12.printNames(list);
    }
}
