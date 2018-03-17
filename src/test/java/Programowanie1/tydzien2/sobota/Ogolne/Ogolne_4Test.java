package Programowanie1.tydzien2.sobota.Ogolne;

import Programowanie1.tydzien2.sobota.Ogolne.Ogolne_4;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_4Test {
    @Test
    public void isRemoveAccentsOk() {
        Ogolne_4 zad4 = new Ogolne_4();
        String text = "Żdąńię bęż polśkich zńaków";
        String result = zad4.removeAccents(text);
        Assert.assertTrue("removing polish accents does not work", "Zdanie bez polskich znakow".equals(result));
    }
}
