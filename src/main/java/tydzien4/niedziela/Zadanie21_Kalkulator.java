//Przygotuj klasę kalkulator posiadającą metody sum, divide, multiply, substract. Każda
//z metod ma przyjmować dwie liczby i zwracać wynik. Przygotuj odpowiednią
//implementację oraz testy jednostkowe sprawdzające działanie każdej z metod.

package tydzien4.niedziela;

public class Zadanie21_Kalkulator
{
    public Integer sum (Integer a, Integer b)
    {
        return a + b;
    }

    public Integer substract (Integer a, Integer b)
    {
        return a - b;
    }

    public Integer multiply (Integer a, Integer b)
    {
        return a * b;
    }

//    public Float divide (Integer a, Integer b)
//    {
//        return (float)a/b;
//    }

    public Float divide (Integer a, Integer b) throws Exception
    {
        if (b == 0)
        {
            throw new Exception ("Can not divide by 0");
        }
        return (float) a / (float) b;
    }
}
