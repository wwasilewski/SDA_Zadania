//Przygotuj program obliczający BMI. Przygotuj testy sprawdzające działanie programu

package tydzien4.niedziela.testyjednostkowe;

import org.junit.Assert;
import org.junit.Test;
import tydzien4.niedziela.Zadanie24_BMI;

import static org.hamcrest.core.Is.is;

public class Zadanie24_BMITest
{
    @Test
    public void shouldcountBMI ()
    {
        Zadanie24_BMI zad24 = new Zadanie24_BMI();
        double result = zad24.sprawdzBMI(186,86);
        double result2 = zad24.sprawdzBMI(186.5,85);
        double result3 = zad24.sprawdzBMI(186,86.5);
        double result4 = zad24.sprawdzBMI(186.5,86.5);
        Assert.assertTrue("cos nie dziala", result == 24.85836512891664);
        Assert.assertTrue("cos nie dziala", result4 == 24.869006461629134);
        Assert.assertThat(result2, is(24.437752014317645));
        Assert.assertThat(result3, is(25.00289050757313));
    }
}
