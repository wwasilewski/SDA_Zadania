//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona wartość zawiera słowo "ala".

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie4
{
    public Boolean sprawdz (String ciag)
    {
        Pattern pattern = Pattern.compile("^(.*?)(ala)(.*)$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
