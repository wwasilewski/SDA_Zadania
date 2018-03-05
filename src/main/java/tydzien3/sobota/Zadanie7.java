//Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
//gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
//myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
//wyrażenie regularne sprawdzające numer seryjny.

package tydzien3.sobota;

import java.util.regex.Pattern;

public class Zadanie7
{
    public Boolean sprawdz (String ciag)
    {
        Pattern pattern = Pattern.compile("^(([A-Z0-9]{5}-){4})([A-Z0-9]{5})$");
        Boolean bool = pattern.matcher(ciag).matches();
        return bool;
    }
}
