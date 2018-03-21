//Przygotuj program sortujący tablicę metodą przez zliczanie
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana

package Programowanie1.tydzien3.Zadania011.ex03;

import Programowanie1.tydzien2.niedziela.CountingSort;

import java.util.Arrays;

public class CountSortRun {
    public static void main(String[] args) {
        int array[] = {6, 2, 3, 7, 5, 3};
        System.out.println("unsorted: " + Arrays.toString(array));

        CountSort cs = new CountSort();
        System.out.println("sorted: " + Arrays.toString(cs.countSort(array)));

        //using earlier made class CountingSort
        CountingSort cings = new CountingSort();
        System.out.println("sorted using earlier made class CountingSort: " + Arrays.toString(cings.countingSort(array)));
    }
}
