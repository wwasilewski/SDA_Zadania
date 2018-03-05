//Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy
//Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb
//które najczęściej się powtarzają w kolejności malejącej..

package Programowanie1.tydzien1.niedziela;

import java.util.ArrayList;
import java.util.Random;

public class Ogolne_5
{
    public static void main(String[] args)
    {
       Random random = new Random();
       ArrayList <Integer> list = new ArrayList<>();

       while(list.size() < 10)
       {
           list.add(random.nextInt(200));
           System.out.println(list);
       }

    }
}
