//Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
//podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie2
{
    public Boolean sprawdz (String ciag)
    {
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
