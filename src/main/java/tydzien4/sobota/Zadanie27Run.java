package tydzien4.sobota;

public class Zadanie27Run
{
    public static void main(String[] args) {

        String string1 = "test";
        String string2 = "testtest";
        String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true );
        System.out.println(longer); // zwraca dłuższy wyraz
        System.out.println(first); // zwraca zmienną string1
    }

}
