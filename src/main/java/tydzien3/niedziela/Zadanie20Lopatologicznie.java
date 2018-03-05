package tydzien3.niedziela;

import java.util.Scanner;

public class Zadanie20Lopatologicznie
{
    public static void main(String[] args)
    {
        int vowels = 0;
        int consonants = 0;

        System.out.print("podaj imie: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++)
        {
            char character = name.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u' || character == 'y')
            {
                vowels++;
            }
            else if (character >= 'a' && character <= 'z')
            {
                consonants++;
            }
        }
        System.out.println("ilosc samoglosek: " + vowels);
        System.out.println("ilosc spolglosek: " + consonants);

    }
}
