//Przygotuj program pobierający liczby od użytkownika. Liczby powinna pobierać
//odpowiednia klasa. Klasa powinna zawierać metodę getNumbersFromUser i powinna
//mieć następującą sygnaturę List<Integer> getNumbersFromUser(). Liczby powinna
//pobierać tak długo aż użytkownik wprowadzi literę “c”.

package Programowanie1.tydzien2.niedziela.Zadania007_OOP.ex02;

import java.util.List;

public class GetNumbersRun {
    public static void main(String[] args) {
        GetNumbers g = new GetNumbers();
        List<Integer> list = g.getNumbersFromUser();
        System.out.println(list);
    }
}
