package Programowanie1.tydzien2.niedziela;

import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {
    @Test
    public void isCountingSortOk() {
        CountingSort c = new CountingSort();
        int array[] = {6, 2, 3, 4, 5, 3};
        int result[] = {2, 3, 3, 4, 5, 6};
        Assert.assertArrayEquals(c.countingSort(array), result);
    }
}
