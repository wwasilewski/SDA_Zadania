package tydzien4.sobota;

public class StringUtils
{
    public static String betterString(String arg1, String arg2, Zadanie27 comparator)
    {
        if(comparator.betterString(arg1,arg2))
        {
            return arg1;
        }
        else
        {
            return arg2;
        }
    }
}
