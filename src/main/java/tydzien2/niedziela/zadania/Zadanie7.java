package tydzien2.niedziela.zadania;

import java.util.ArrayList;

public class Zadanie7
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        listOfInteger.add(4);
        listOfInteger.add(2);
        listOfInteger.add(1);
        listOfInteger.add(8);
        listOfInteger.add(3);

        try {
            System.out.println(listOfInteger.get(7));
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("probujesz pobrac element spoza tablicy");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
