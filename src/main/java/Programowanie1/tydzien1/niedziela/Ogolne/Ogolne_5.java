/*
 * Created by Wojciech Wasilewski
 */

//Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy
//Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb
//które najczęściej się powtarzają w kolejności malejącej..

package Programowanie1.tydzien1.niedziela.Ogolne;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ogolne_5
{
    public static void main(String[] args)
    {
        Random random = new Random();
        List <Integer> list = new ArrayList<>();

        while(list.size() < 10)
        {
           list.add(random.nextInt(20));
        }
        System.out.println(list);


        Map counts = list.stream()
//                .sorted((x1,x2) -> x1.compareTo(x2))

               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        List<Integer> listOfMaxNumbers = numbers.entrySet()
//                .stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .map(entry -> entry.getKey())
//                .limit(5)
//                .collect(Collectors.toList());
//        System.out.println(listOfMaxNumbers);

        System.out.println(counts);
    }
}
