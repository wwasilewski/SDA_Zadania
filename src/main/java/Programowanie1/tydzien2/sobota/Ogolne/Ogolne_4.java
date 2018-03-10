//Napisz program, który pobiera od użytkownika wyraz lub zdanie i usuwa z niego
//polskie znaki diakrytyczne. Przykładowo zdanie “Zażółć gęślą jaźń” zostanie
//zamienione na “Zazolc gesla jazn”.

package Programowanie1.tydzien2.sobota.Ogolne;

import java.text.Normalizer;

public class Ogolne_4 {
    public String removeAccents(String text) {
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return text;
    }
}
