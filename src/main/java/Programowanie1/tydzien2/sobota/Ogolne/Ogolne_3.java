//Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
//odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.

package Programowanie1.tydzien2.sobota.Ogolne;

public class Ogolne_3 {
    public String reverseString(String text) {
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString += text.charAt(i);
        }
        return reversedString;
    }
}
