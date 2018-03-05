package tydzien3.sobota;

import java.util.regex.Pattern;

public class Panda
{
    public Boolean sprawdzPande (String panda)
    {
        Pattern pattern = Pattern.compile(".*and.*");
        Boolean bool = pattern.matcher(panda).matches();
        return bool;
    }
//        Pattern pattern = Pattern.compile(".*d.*");
//        Boolean bool = pattern.matcher("panda").matches();
//        System.out.println("wynik: " + bool);
//
//        Pattern pattern2 = Pattern.compile("\\d");
//        Boolean bool2 = pattern2.matcher("3").matches();
//        System.out.println("wynik: " + bool2);
//
//        Pattern pattern3 = Pattern.compile("\\d{1,5}");
//        Boolean bool3 = pattern3.matcher("344").matches();
//        System.out.println("wynik: " + bool3);
//
//        Pattern pattern4 = Pattern.compile("\\d{1,2}/\\d{1,3}");
//        Boolean bool4 = pattern4.matcher("33/44").matches();
//        System.out.println("wynik: " + bool4);
//
//        Pattern pattern5 = Pattern.compile("\\d{1,2}[a-z]/\\d{1,3}");
//        Boolean bool5 = pattern5.matcher("33a/44").matches();
//        System.out.println("wynik: " + bool5);

}
