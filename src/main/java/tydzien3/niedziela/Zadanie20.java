package tydzien3.niedziela;

public class Zadanie20 {

    public int countVowels(String name)
    {
        int vowels = 0;

        for (int i = 0; i < name.length(); i++)
        {
            char znak = name.charAt(i);
            if (znak == 'a' || znak == 'e' || znak == 'i'
                    || znak == 'o' || znak == 'u' || znak == 'y')
            {
                vowels++;
            }
        }
        return vowels;
    }

    public int countConsonants(String name)
    {
        int consonants = 0;

        for (int i = 0; i < name.length(); i++)
        {
            char znak = name.charAt(i);
            if (!(znak == 'a' || znak == 'e' || znak == 'i'
                    || znak == 'o' || znak == 'u' || znak == 'y'))
            {
                consonants++;
            }
        }
        return consonants;
    }
}