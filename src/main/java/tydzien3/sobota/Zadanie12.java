//Przygotuj program, który pobiera od użytkownika imiona i dodaje je do listy
//generycznej typu String. Koniec wprowadzania imion następuje po wprowadzeniu
//słowa “koniec”. Następnie program korzystając z pętli foreach wyświetla po kolei
//wszystkie imiona podając na końcu każdego imienia ilość znaków z których się
//składa (np. Jan (3))

package tydzien3.sobota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie12 {
    public List<String> addNames() {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String usersName = "";

        while (true) {
            System.out.println("Provide name, type \"koniec\" to end program: ");
            usersName = sc.nextLine();

            if ("koniec".equals(usersName) || "Koniec".equals(usersName) || "KONIEC".equals(usersName)) {
                break;
            } else {
                list.add(usersName);
            }
        }
        sc.close();
        return list;
    }

    public void printNames(List<String> list) {
        for (String x : list) {
            System.out.println(x + "(" + x.length() + ")");
        }
    }
}
