package tydzien4.niedziela;

public class Zadanie24_BMI
{
    public double sprawdzBMI(double wzrost, double waga)
    {
        return waga / (wzrost*wzrost/10000);
    }
}
