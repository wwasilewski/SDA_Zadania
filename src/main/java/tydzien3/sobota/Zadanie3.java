//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//a maksymalna 16 znaków.

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie3
{
    public Boolean sprawdz (String ciag)
    {
//        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,16}$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
