package Programowanie1.tydzien2.sobota.Interfejsy;

import Programowanie1.tydzien2.sobota.Interfejsy.PizzaDough.*;

import java.util.ArrayList;
import java.util.List;

public class PizzaRun {
    public static void main(String[] args) {
        List<Pizza> list = new ArrayList<>();
        list.add(new Margherita(new GlutenFree()));
        list.add(new Hawaiian(new FeelGoodFlatbread()));
        list.add(new Veggie(new StuffedCrust()));

        for (Pizza x : list) {
            x.preparePizza();
        }
    }
}
