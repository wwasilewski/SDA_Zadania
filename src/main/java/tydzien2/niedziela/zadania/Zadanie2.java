package tydzien2.niedziela.zadania;

import java.util.ArrayList;

public class Zadanie2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        listOfInteger.add(4);
        listOfInteger.add(2);
        listOfInteger.add(5);

        System.out.println(listOfInteger.size());
        System.out.println(listOfInteger.get(0));
        System.out.println(listOfInteger.get(2));
    }

}
