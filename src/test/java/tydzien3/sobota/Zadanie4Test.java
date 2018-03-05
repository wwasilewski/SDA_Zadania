package tydzien3.sobota;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zadanie4Test
{
    @Test
    public void isAlaInString()
    {
        Zadanie4 zad4 = new Zadanie4();
        Boolean result = zad4.sprawdz("czy w tym ciagu schowala sie malutka ALA czy nie");
        Boolean result2 = zad4.sprawdz("a moze tutaj chowa sie ala?");

        Assert.assertTrue("tutaj nie ma ali",result == true);
        Assert.assertThat(result2, is(true)); //tak tez mozna
    }
}
