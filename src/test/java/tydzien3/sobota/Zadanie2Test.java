package tydzien3.sobota;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zadanie2Test
{
    @Test
    public void isPostalCodeCorrect()
    {
        Zadanie2 zad2 = new Zadanie2();
        Boolean result = zad2.sprawdz("00-000");
        Boolean result2 = zad2.sprawdz("99-999");

        Assert.assertTrue("incorrect postal code", result == true);
        Assert.assertThat(result2, is(true)); //to samo co wyzej inny sposob
    }
}
