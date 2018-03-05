//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
//liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie6
{
    public Boolean sprawdz (String ciag)
    {
        Pattern pattern = Pattern.compile("^[A-Z]{3}[0-9]{5}[a-z]{1}[A-Z]{1}$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
