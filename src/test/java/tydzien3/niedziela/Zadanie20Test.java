package tydzien3.niedziela;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zadanie20Test
{
    @Test
    public void shouldSumVowels()
    {
        Zadanie20 zad20 = new Zadanie20();
        int result = zad20.countVowels("karolina");
        int result2 = zad20.countVowels("wojtek");

        Assert.assertTrue("counting vowels does not work correctly", result == 4);
        Assert.assertThat(result2, is(2)); // druga metoda do tego co wyzej - rownowazna
    }

    @Test
    public void shouldSumConsonants()
    {
        Zadanie20 zad20 = new Zadanie20();
        int result = zad20.countConsonants("karolina");
        int result2 = zad20.countConsonants("wojtek");

        Assert.assertTrue("counting consonants does not work correctly", result == 4);
        Assert.assertThat(result2, is(4)); // druga metoda do tego co wyzej - rownowazna
    }
}
