//Za pomocą strumieni i klasy IntStream wygeneruj liczby losowania lotto. 1-49

package tydzien4.sobota;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie30
{
    public static void main(String[] args)
    {
        Random random = new Random();
        List <Integer> listOfNumbers = new ArrayList<>();
        IntStream.rangeClosed(1,6)
                .forEach (item ->  listOfNumbers.add (random.nextInt( 48 )+1 ));
        listOfNumbers.forEach( item -> System.out.print(" " + item));

// List <Integer> numbers = new Random()
//                .ints(1,49)
//                .distinct()
//                .limit(6)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(numbers);



    }
}
