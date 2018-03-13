//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź
//średnią wartość elementów przechowywanych w tablicy

package Programowanie1.tydzien2.niedziela.Zadania004_StreamLambda.ex03;

import java.util.stream.IntStream;

public class Stream_3 {
    public double averageValue(int[] numbers) {
        double average = IntStream.of(numbers).average().getAsDouble();
        return average;
    }
}
