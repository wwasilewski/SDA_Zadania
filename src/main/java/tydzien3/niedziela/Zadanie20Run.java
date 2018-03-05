package tydzien3.niedziela;

import java.util.Scanner;

public class Zadanie20Run
{
    public static void main(String[] args)
    {
        System.out.print("podaj imie: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Zadanie20 zad = new Zadanie20();
        System.out.println("ilosc samoglosek: " + (zad.countVowels(name))
                + " ilosc spolglosek: " + (zad.countConsonants(name)));
    }
}
