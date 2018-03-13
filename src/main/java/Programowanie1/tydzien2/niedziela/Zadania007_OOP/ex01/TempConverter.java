//Napisz program konwertujący temperaturę o C<=>F. Przygotuj klasę konwertującą
//temperaturę i wykorzystaj ją w Main. Przygotuj testy jednostkowe sprawdzające
//konwersję temperatury na F i na C.

package Programowanie1.tydzien2.niedziela.Zadania007_OOP.ex01;

public class TempConverter {
    public double celcToFahr(double tempC) {
        return (32 + (tempC * 9 / 5));
    }

    public double fahrToCelc(double tempF) {
        return (tempF - 32) * 5 / 9;
    }
}
