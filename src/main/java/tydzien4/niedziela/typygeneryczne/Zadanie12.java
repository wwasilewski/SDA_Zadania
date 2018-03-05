//Przygotuj program, który pobiera od użytkownika imiona i dodaje je do listy
//generycznej typu String. Koniec wprowadzania imion następuje po wprowadzeniu
//słowa “koniec”. Następnie program korzystając z pętli foreach wyświetla po kolei
//wszystkie imiona podając na końcu każdego imienia ilość znaków z których się
//składa (np. Jan (3))

package tydzien4.niedziela.typygeneryczne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        System.out.print("podaj imiona do dodania (po kazdym wcisnij ENTER, slowo \"koniec\" przerywa): ");

        String imie = sc.nextLine();
        while (!imie.equals("koniec"))
        {
            lista.add(imie);
            imie = sc.next();
        }

        for (String wypisz : lista)
        {
            System.out.println(wypisz + "(" + wypisz.length() + ")");
        }
        sc.close();
    }
}
