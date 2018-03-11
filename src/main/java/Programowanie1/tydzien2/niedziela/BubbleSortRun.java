package Programowanie1.tydzien2.niedziela;

import java.util.Arrays;

public class BubbleSortRun {
    public static void main(String[] args) {
        int array[] = {6, 2, 3, 4, 5, 3};
        BubbleSort b = new BubbleSort();

        System.out.println("result: " + Arrays.toString(b.bubbleSort(array)));
    }
}
