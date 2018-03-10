//Przygotuj interfejs o nazwie Pizza do wypiekania pizzy posiadający jedną metodę
//void preparePizza(). Zaimplementuj w/w interfejs w klasie Margherita, Hawaiian,
//Veggie. Niech metoda preparePizza() wyświetla na konsoli kroki jakie należy
//wykonać aby przygotować pizzę. Każda pizza powinna mieć listę składników, która
//będzie przechowywana jako lista. Utwórz konstruktor bezparametrowy oraz taki,
//który umożliwia przekazanie listy składników do każdej pizzy.

package Programowanie1.tydzien2.sobota.Interfejsy;

import java.util.ArrayList;
import java.util.List;

public class Veggie implements Pizza
{
    private List <String> ingredientsList;

    public Veggie()
    {
        this.ingredientsList = new ArrayList<>();
        ingredientsList.add("cheese");
        ingredientsList.add("tomato sauce");
        ingredientsList.add("onion");
        ingredientsList.add("spinach");
    }

    @Override
    public void preparePizza()
    {
        System.out.println("----- Veggie Pizza -----");
        System.out.println("Making pizza dough");
        System.out.println("Adding ingredients: ");
        for (String x : ingredientsList)
        {
            System.out.print(x + " ");
        }
        System.out.println("\nNow it's cooking time");
        System.out.println("Pizza is ready");
    }
}
