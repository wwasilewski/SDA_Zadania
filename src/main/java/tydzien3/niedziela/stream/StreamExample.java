package tydzien3.niedziela.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample
{

    public static void displayList(List<Integer> list)
    {
        list.forEach(element -> System.out.println(element + " "));
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(55);
        numbers.add(2);
        displayList(numbers);

        List<Integer> filteredList = numbers.stream()
                        //.filter(element -> element > 5)
                        .map (element -> element *2)
                        .sorted((element1, element2) -> element1.compareTo(element2)) // element2.compareTo(element1) zeby posortowal odwrotnie
                        .collect(Collectors.toList());

        displayList(filteredList);
    }
}
