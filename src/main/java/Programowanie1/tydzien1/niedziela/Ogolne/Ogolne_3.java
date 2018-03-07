/*
 * Created by Wojciech Wasilewski
 */

//Przygotuj program losujący 20 liczb całkowitych. Program musi pamiętać
//wylosowane liczby i jeśli liczba wylosowana się powtórzyła następuje ponowne
//losowanie, aż do wylosowania liczby unikalnej.

package Programowanie1.tydzien1.niedziela.Ogolne;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ogolne_3
{
    public static void main(String[] args)
    {

        Random r = new Random();
        Set <Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size()<20)
        {
            uniqueNumbers.add(r.nextInt(100));
        }

        for (Integer i : uniqueNumbers){
            System.out.print(i + " ");
        }
    }
}
