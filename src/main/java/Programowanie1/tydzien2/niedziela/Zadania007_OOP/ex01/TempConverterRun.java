//Napisz program konwertujący temperaturę o C<=>F. Przygotuj klasę konwertującą
//temperaturę i wykorzystaj ją w Main. Przygotuj testy jednostkowe sprawdzające
//konwersję temperatury na F i na C.

package Programowanie1.tydzien2.niedziela.Zadania007_OOP.ex01;

public class TempConverterRun {
    public static void main(String[] args) {
        TempConverter t = new TempConverter();
        System.out.println("Program converting temperature C<=>F");
        System.out.println("25 o C = " + t.celcToFahr(25) + " o F");
        System.out.println("25 o F = " + t.fahrToCelc(25) + " o C");
    }
}
