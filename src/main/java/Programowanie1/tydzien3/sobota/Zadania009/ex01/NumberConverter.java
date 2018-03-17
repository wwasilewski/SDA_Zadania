//Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
//zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej. Np. 23 ->
//dwadzieścia trzy

package Programowanie1.tydzien3.sobota.Zadania009.ex01;

import java.util.HashMap;

/**
 * Class converting number value to text value. Ex. if you provide "23" class
 * will convert value to "dwadziescia trzy"
 */

public class NumberConverter
{
    HashMap<Integer, String> unityMap = new HashMap<>();

    HashMap <Integer, String> textMapLess20 = new HashMap<>();

    HashMap <Integer, String> tensMap = new HashMap<>();

    public NumberConverter()
    {
        unityMap.put (1, "jeden");
        unityMap.put (2, "dwa");
        unityMap.put (3, "trzy");
        unityMap.put (4, "cztery");
        unityMap.put (5, "piec");
        unityMap.put (6, "szesc");
        unityMap.put (7, "siedem");
        unityMap.put (8, "osiem");
        unityMap.put (9, "dziewiec");

        textMapLess20.put (10, "dziesiec");
        textMapLess20.put (11, "jedenascie");
        textMapLess20.put (12, "dwanascie");
        textMapLess20.put (13, "trzynascie");
        textMapLess20.put (14, "czternascie");
        textMapLess20.put (15, "pietnascie");
        textMapLess20.put (16, "szesnascie");
        textMapLess20.put (17, "siedemnaście");
        textMapLess20.put (18, "osiemnascie");
        textMapLess20.put (19, "dziewietnascie");

        tensMap.put (2, "dwadziescia");
        tensMap.put (3, "trzydzieści");
        tensMap.put (4, "czterdziesci");
        tensMap.put (5, "piecdziesiat");
        tensMap.put (6, "szescdziesiat");
        tensMap.put (7, "siedemdziesiat");
        tensMap.put (8, "osiemdziesiat");
        tensMap.put (9, "dziewiecdziesiat");
    }
    /**
     * Converts provided integer value by user to text value representation
     * Allowed range is <1,99>
     * @param number Number to convert to text representaion
     * @return Number as text
     */
    public String convertToString (Integer number)
    {
        if (number > 99 || number < 1)
        {
            throw new IllegalArgumentException("Provided number is out of range");
        }
        String result ="";

        if (number < 10)
        {
            result = unityMap.get(number);
        } else if (number < 20)
        {
            result = textMapLess20.get(number);
        } else
        {
            Integer tensDigit = number / 10;
            Integer unityDigit = number%10;
            result = tensMap.get(tensDigit);
            if (unityDigit > 0)
            {
                result = unityMap.get(unityDigit);
            }
        }
        return result;
    }
}
