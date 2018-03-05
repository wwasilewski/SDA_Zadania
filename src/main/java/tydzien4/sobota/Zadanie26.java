package tydzien4.sobota;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie26
{
    public static void main(String[] args) {
        String el[] = {"Wojtek","Ania","Bartek","Gawel","Marek","Hanna","Marta","Karolina","Goska","Brunchilda"};
        List<String> sortedNames = Arrays.stream(el)
                        .sorted((name1, name2) -> ((Integer) name1.length()) //rzutujemy zeby skorzystac z compareTo
                        .compareTo((Integer) name2.length()))
                        .collect(Collectors.toList());

        //zeby zrobic w druga strone wystarczy zamienic w lambdach

        sortedNames.forEach(element -> System.out.println(element + " "));

        String el2[] = {"Wojtek","Ania","Bartek","Gawel","Marek","Hanna","Marta","Karolina","Goska","Brunchilda"};
        List<String> sortedNames2 = Arrays.stream(el2)
                        .sorted((name3, name4) -> ((Integer) name4.length()) //rzutujemy zeby skorzystac z compareTo
                        .compareTo((Integer) name3.length()))
                        .collect(Collectors.toList());

        //zeby zrobic w druga strone wystarczy zamienic w lambdach

        sortedNames2.forEach(element2 -> System.out.println(element2 + " "));

        String el3[] = {"Wojtek","Ania","Bartek","Gawel","Marek","Hanna","Marta","Karolina","Goska","Brunchilda"};
        List<String> sortedNames3 = Arrays.stream(el3)
                        .sorted((name1, name2) -> ((Character) name1.charAt(0)) //rzutujemy zeby skorzystac z compareTo
                        .compareTo((Character) name2.charAt(0)))
                        .collect(Collectors.toList());

        //zeby zrobic w druga strone wystarczy zamienic w lambdach

        sortedNames3.forEach(element -> System.out.println(element + " "));
    }
}
