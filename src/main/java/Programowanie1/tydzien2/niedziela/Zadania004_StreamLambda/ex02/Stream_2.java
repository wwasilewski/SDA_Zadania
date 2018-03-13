//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź
//minimalną wartość.

package Programowanie1.tydzien2.niedziela.Zadania004_StreamLambda.ex02;

import java.util.stream.IntStream;

public class Stream_2 {
    public int minValue(int[] numbers) {
        int min = IntStream.of(numbers).min().getAsInt();
        return min;
    }
}
