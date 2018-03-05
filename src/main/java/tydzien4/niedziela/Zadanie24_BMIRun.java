package tydzien4.niedziela;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie24_BMIRun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("podaj swoj wzrost w cm (mozesz uzyc przecinka):  ");
            double wzrost = sc.nextDouble();
            System.out.print("podaj swoja wage w kg (z przecinkiem, np 75,65):  ");
            double waga = sc.nextDouble();

            Zadanie24_BMI zad24 = new Zadanie24_BMI();
            System.out.println("twoje BMI: " + zad24.sprawdzBMI(wzrost, waga));
            System.out.format("twoje BMI to: " + "%.2f%n", zad24.sprawdzBMI(wzrost, waga));
        }
        catch (InputMismatchException e)
        {
            System.out.println("podano liczbe w zlym formacie");
        }

        sc.close();
    }
}
