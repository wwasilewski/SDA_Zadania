//Przygotuj aplikację pobierającą od użytkownika dowolny tekst. Wprowadzony tekst
//powinien zostać podzielony na słowa (korzystając z metody split klasy String), a
//następnie program powinien wyświetlić statystyki wpisanego przez użytkownika
//tekstu.
//Ilość słów: <ilość_słów>
//Ilość wprowadzonych znaków: <ilość_znaków>
//Średnia długość wprowadzonego słowa: <ilość_znaków>
//Najdłuższe słowo: <ilość_znaków>
//Najkrótsze słowo: <ilość_znaków>

package tydzien3.sobota;

public class Zadanie9
{
    public String[] podziel (String ciag)
    {
        String poPodziale[] = ciag.split("[^A-Za-z0-9ąęóżźńśćł]+");
        return poPodziale;
    }

    public int ileZnakow (String ciag)
    {
//        String s = ciag.replace(" ", ""); // bez spacji
        int counter = ciag.length();
        return counter;
    }

    public float srednia (String ciag)
    {
//        String charSum = ciag.replace(" ","");
//        int counter = charSum.length();
//        String strArray[] = ciag.replace(",","").replace(".","").split(" ");
        String strArray[] = ciag.split("[^A-Za-z0-9ąęóżźńśćł]+");
        float totalChars = 0;

        for(String s : strArray)
        {
            totalChars = totalChars + s.length();
        }

        float words = strArray.length;
        float averageWordLength = totalChars/words; //mozna tu tez ...= counter/words;
        return averageWordLength;
    }

    public String longest (String [] ciag)
    {
        int index = 0;
        int elementLength = ciag[0].length();
        for (int i = 1; i < ciag.length; i++)
        {
            if (elementLength < ciag[i].length())
            {
                index = i;
                elementLength = ciag[i].length();
            }
        }
        return ciag[index];
    }

    public String shortest (String [] ciag)
    {
        int index = 0;
        int elementLength = ciag[0].length();
        for (int i = 1; i < ciag.length; i++)
        {
            if (elementLength > ciag[i].length())
            {
                index = i;
                elementLength = ciag[i].length();
            }
        }
        return ciag[index];
    }

}
