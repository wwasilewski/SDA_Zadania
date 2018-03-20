//Przygotuj program dodający n liczb wprowadzonych przez użytkownika. Operacje
//dodawania powinny być w osobnej klasie. Metoda w klasie powinna zwracać sumę
//dodawania i przyjmować wiele argumentów. Skorzystaj z varargs. Nie przekazuj liczb
//do sumowania jako kolekcję. Napisz testy jednostkowe sprawdzające poprawność
//sumowania.

package Programowanie1.tydzien2.niedziela.Zadania007_OOP.ex03;

public class SumNumbersVarArgsRun {
    public static void main(String[] args) {
        SumNumbersVarArgs s = new SumNumbersVarArgs();
        System.out.println("sum: " + s.sum(3, 4, 6, 7, 2));
    }
}
