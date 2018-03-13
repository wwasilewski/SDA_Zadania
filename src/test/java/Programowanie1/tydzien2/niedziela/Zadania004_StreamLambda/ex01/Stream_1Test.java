package Programowanie1.tydzien2.niedziela.Zadania004_StreamLambda.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Stream_1Test {
    @Test
    public void isMaxValueOk() {
        Stream_1 zad1 = new Stream_1();
        int array[] = {3, 5, 8, 88, 32, -2};
        int result = 88;
        Assert.assertThat(zad1.maxValue(array), is(result));
    }
}
