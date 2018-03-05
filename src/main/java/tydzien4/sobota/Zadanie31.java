//Wykorzystując klasę Stream wygeneruj 10 losowych liczb z zakresu <0,100),
//następnie wymnóż każdą wylosowaną liczbę za pomocą map przez 2 i korzystając z
//forach wyświetl każdą wylosowany i wymnożoną liczbę.

package tydzien4.sobota;

import java.util.Random;

public class Zadanie31
{
    public static void main(String[] args)
    {
        Random random = new Random();
        random.ints(5,0,100)
                .map (item -> item*2)
                .forEach(item -> {
                                    System.out.println("wylosowana liczba: " + item/2);
                                    System.out.println("wylosowana liczbax2: " + item);
                });
    }
}
