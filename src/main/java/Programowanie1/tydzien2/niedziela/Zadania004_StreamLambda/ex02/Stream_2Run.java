//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź
//minimalną wartość.

package Programowanie1.tydzien2.niedziela.Zadania004_StreamLambda.ex02;

public class Stream_2Run {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        Stream_2 zad1 = new Stream_2();
        System.out.println(zad1.minValue(numbers));
    }
}
