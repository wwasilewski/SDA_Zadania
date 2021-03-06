//Przygotuj program dodający n liczb wprowadzonych przez użytkownika. Operacje
//dodawania powinny być w osobnej klasie. Metoda w klasie powinna zwracać sumę
//dodawania i przyjmować wiele argumentów. Skorzystaj z varargs. Nie przekazuj liczb
//do sumowania jako kolekcję. Napisz testy jednostkowe sprawdzające poprawność
//sumowania.

package Programowanie1.tydzien2.niedziela.Zadania007_OOP.ex03;

public class SumNumbersVarArgs {
    public int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}

