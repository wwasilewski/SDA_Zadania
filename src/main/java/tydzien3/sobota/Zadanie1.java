//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
//liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
//użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
//nieparzystości.

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie1
{
    public Boolean sprawdz(String ciag)
    {
        Pattern pattern = Pattern.compile("-?\\d*"); // - oznacza liczy ujemne
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
