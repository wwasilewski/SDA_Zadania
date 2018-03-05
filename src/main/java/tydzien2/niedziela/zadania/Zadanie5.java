package tydzien2.niedziela.zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie5
{
    public static void main(String[] args)
    {
        ArrayList<String> listOfString = new ArrayList<String>();

        System.out.println("podaj 5 imion, po kazdym ENTER: ");
        Scanner podaj = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            String imie = podaj.nextLine();
            listOfString.add(imie);
        }

        for (int i = 0; i < listOfString.size(); i++)
        {
            System.out.println(listOfString.get(i));
        }

        podaj.close();
    }
}
