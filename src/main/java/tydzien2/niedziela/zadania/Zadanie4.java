package tydzien2.niedziela.zadania;

import java.util.ArrayList;

public class Zadanie4
{
    public static void main(String[] args)
    {
        ArrayList <String> listOfString = new ArrayList<String>();
        listOfString.add("Wojtek");
        listOfString.add("Ania");
        listOfString.add("Marek");
        listOfString.add("Tomek");
        listOfString.add("Igor");

        for (String wypisz : listOfString)
        {
            System.out.println(wypisz);
        }

        for (int i = listOfString.size()-1; i >= 0; i--)
        {
            System.out.println(listOfString.get(i));
        }


    }
}
