package Programowanie1.tydzien2.sobota.Interfejsy;

import java.util.ArrayList;
import java.util.List;

public class PizzaRun
{
    public static void main(String[] args)
    {
        Veggie veggie = new Veggie();
        veggie.preparePizza();

        Hawaiian hawaiian = new Hawaiian();
        hawaiian.preparePizza();

        Margherita margherita = new Margherita();
        margherita.preparePizza();

        List <String> myIngredients = new ArrayList<>();
        myIngredients.add("cheese");
        myIngredients.add("tomato sauce");
        myIngredients.add("cucumber");
        myIngredients.add("tomato");
        myIngredients.add("onion");

        MyPizza mypizza = new MyPizza(myIngredients);
        mypizza.preparePizza();
    }
}
