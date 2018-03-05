package tydzien2.niedziela.zadania;

public class Zadanie8
{
    public static void main(String[] args)
    {
        String imie = "Olgierd";
        System.out.println(imie.toUpperCase());
        System.out.println(imie.toLowerCase());
        System.out.println(imie.length());
        System.out.println(imie.startsWith("O"));
        System.out.println(imie.contains("e"));

        System.out.println(imie.replace("e", "").replace("i", ""));

        for (int i = 0; i < imie.length(); i++)
        {
            System.out.println("[" + (i+1) + "] = " + imie.charAt(i));
        }
    }
}
