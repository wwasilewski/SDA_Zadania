//Przygotuj aplikację sprawdzającą czy podany numer tablicy rejestracyjnej jest
//poprawny. Przygotuj klasę o nazwie PlateValidator posiadającą metodę
//public boolean validate(String plate);
//Na potrzeby zadania przyjmij, że tablica rejestracyjną jest poprawna gdy zawiera 2
//litery, a następnie 5 cyfr lub 4 cyfry i jedna litery lub 3 cyfry i 2 litery.
//Poprawny numer tablicy rejestracyjnej to: CB3456J, CB34212, WY640WI
//Błędny numer tablicy rejestracyjnej to: CBS3456, W1234YU, CC14WYG

package Programowanie1.tydzien3.Zadania008.ex04;

import java.util.regex.Pattern;

public class PlateValidator {
    public boolean validate(String plate) {
        Pattern p = Pattern.compile("([A-Z]{2})(([0-9]{5})|([0-9]{4}[A-Z]{1})|([0-9]{3}[A-Z]{2}))");
        boolean bool = p.matcher(plate).matches();
        return bool;
    }
}
