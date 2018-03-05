package tydzien2.niedziela.zadania;

import java.util.ArrayList;

public class Zadanie3
{
    public static void main(String[] args)
    {
        ArrayList <Float> listOfFloat = new ArrayList<Float>();
        listOfFloat.add(Float.valueOf(6));
        listOfFloat.add(Float.valueOf(2));
        listOfFloat.add(Float.valueOf(1));
        listOfFloat.add(4f);
        listOfFloat.add(5f);
        listOfFloat.add(7f);
        listOfFloat.add(2f);
        listOfFloat.add(4f);
        listOfFloat.add(1f);
        listOfFloat.add(4f);

        System.out.println("suma pierwszy i ostatni: " + (listOfFloat.get(0) + listOfFloat.get(listOfFloat.size()-1)));
        System.out.println("iloraz pierwszy i ostatni: " + (listOfFloat.get(0) * listOfFloat.get(9)));
        System.out.println("iloraz drugi i przedostatni: " + (listOfFloat.get(1) / listOfFloat.get(listOfFloat.size()-2)));

    }
}
