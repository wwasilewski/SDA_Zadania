//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
//"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
//też poprawna wartość.

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie5
{
    public Boolean sprawdz (String ciag)
    {
//        Pattern pattern = Pattern.compile("^([0-9]{2}).([0-9]{2}).([0-9]{4}r.)");
        Pattern pattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}r.$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
