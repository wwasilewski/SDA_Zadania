//Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
//i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
//stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.

package Programowanie1.tydzien1.niedziela.Tablice;

import java.util.Arrays;

public class Tablice_7 {
    public static void checkSumFromArray(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("sumEven > sumOdd" + " --> sumEven:" + sumEven + ", sumOdd:" + sumOdd);
        } else {
            System.out.println("sumOdd > sumEven" + " --> sumEven:" + sumEven + ", sumOdd:" + sumOdd);
        }
    }

    public static void main(String[] args) {
        int array1[] = {1, 0, 1, 0, 1, 0, 1};
        int array2[] = {0, 1, 0, 1, 0, 1, 0};

        System.out.println("Array1: " + Arrays.toString(array1));
        checkSumFromArray(array1);

        System.out.println("\nArray2: " + Arrays.toString(array2));
        checkSumFromArray(array2);
    }
}
