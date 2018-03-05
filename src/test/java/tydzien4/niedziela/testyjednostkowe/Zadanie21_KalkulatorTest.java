//Przygotuj klasę kalkulator posiadającą metody sum, divide, multiply, substract. Każda
//z metod ma przyjmować dwie liczby i zwracać wynik. Przygotuj odpowiednią
//implementację oraz testy jednostkowe sprawdzające działanie każdej z metod.

package tydzien4.niedziela.testyjednostkowe;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import tydzien4.niedziela.Zadanie21_Kalkulator;

import static org.hamcrest.core.Is.is;

public class Zadanie21_KalkulatorTest
{
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void shouldAddTwoNumbers()
    {
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Integer result = calc.sum(5,5);
        Assert.assertTrue("sum does not work correctly", result == 10);
    }

    @Test
    public void shouldSubstractTwoNumbers()
    {
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Integer result = calc.substract(6,3);
        Assert.assertTrue("substract does not work correctly", result == 3);
    }

    @Test
    public void shouldMultiplyTwoNumbers()
    {
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Integer result = calc.multiply(4,6);
        Assert.assertTrue("multiply does not work correctly", result == 24);
        Assert.assertThat(result, is(24)); // druga metoda do tego o wyzej - rownowazna
    }

    @Test
    public void shouldDivideCorrectly() throws Exception
    {
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Float result = calc.divide(10,2);
        Float expectedResult = 5f;
        Assert.assertThat(result,is(expectedResult));

    }

    @Test
    public void shouldDivideWithFraction() throws Exception
    {
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Float result = calc.divide(10,4);
        Float expectedResult = 2.5f;
        Assert.assertThat(result,is(expectedResult));
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldThrowException() throws Exception
    {
        thrown.expect(Exception.class);
        thrown.expectMessage("Can not divide by 0");
        Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
        Float result = calc.divide(10,0);
        //Float expectedResult = 2.5f;
        //Assert.assertThat(result,is(Float.POSITIVE_INFINITY));
    }

    @Test
    public void shouldThrowException2() throws Exception
    {
        try
        {
            Zadanie21_Kalkulator calc = new Zadanie21_Kalkulator();
            Float result = calc.divide(10, 0);
            Assert.fail();
        }
        catch (Exception e)
        {
            Assert.assertThat(e.getMessage(),is("Can not divide by 0"));

            //Float expectedResult = 2.5f;
            //Assert.assertThat(result,is(Float.POSITIVE_INFINITY));
        }
    }
}
