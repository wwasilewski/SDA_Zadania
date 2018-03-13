//Zaimplementuj metodę preparePizzaDough() w każdej klasie. Niech ta metoda
//wyświetla tekst na konsoli “Przygotowywanie ciasta <nazwa_ciasta>”

package Programowanie1.tydzien2.sobota.Interfejsy.PizzaDough;

public class AllAmericanThin implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Preparing AllAmericanThin dough");
    }
}
