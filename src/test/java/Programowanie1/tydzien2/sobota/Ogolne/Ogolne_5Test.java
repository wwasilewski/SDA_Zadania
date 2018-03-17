//Napisz program, który pobiera od użytkownika wyraz lub zdanie i sprawdza czy
//wprowadzony ciąg znaków jest palindromem. Przykładowy palindrom to “kajak” lub
//“Może jutro ta dama da tortu jeżom”. Program po analizie wyświetla komunikat:
//Wprowadzony ciąg znaków “<wprowadzone_znaki>” jest palindromem
//lub Wprowadzony ciąg znaków “<wprowadzone_znaki>” nie jest palindromem

package Programowanie1.tydzien2.sobota.Ogolne;

import Programowanie1.tydzien2.sobota.Ogolne.Ogolne_5;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_5Test {
    @Test
    public void isStringPalindrome() {
        Ogolne_5 zad5 = new Ogolne_5();
        String text = "Może jutro ta dama da tortu jeżom";
        Boolean result = zad5.palindrome(text);
        Assert.assertTrue("method does not work correctly", result == true);
    }

    @Test
    public void isStringNotPalindrome() {
        Ogolne_5 zad5 = new Ogolne_5();
        String text = "kajaki";
        Boolean result = zad5.palindrome(text);
        Assert.assertTrue("method does not work correctly", result == false);
    }
}
