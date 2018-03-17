package Programowanie1.tydzien2.sobota.Ogolne;

import org.junit.Assert;
import org.junit.Test;

public class Ogolne_3Test {
    @Test
    public void isReverseOk() {
        Ogolne_3 zad3 = new Ogolne_3();
        String text = "domek";
        String result = zad3.reverseString(text);
        Assert.assertTrue("method does not work correctly", "kemod".equals(result));
    }
}
