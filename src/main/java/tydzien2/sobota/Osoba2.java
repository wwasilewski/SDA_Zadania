package tydzien2.sobota;

public class Osoba2
{
    private double wzrost;
    private double waga;

    public Osoba2(double wzrost, double waga)
    {
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public Osoba2()
    {
        wzrost = 170;
        waga = 60;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double calculateBMI()
    {
        return 2.0;  // UZUPELNIC
    }

    public String toString()
    {
        return "Osoba" + "wzrost" + wzrost + "waga" + waga + "BMI" + calculateBMI();
    }

    public static void main(String[] args)
        {
            System.out.println("cos");

        }

}