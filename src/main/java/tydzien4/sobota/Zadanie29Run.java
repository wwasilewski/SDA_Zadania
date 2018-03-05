//Wykorzystując przygotowaną listę z poprzedniego zadania za pomocą strumieni
//znajdź konto, które ma najwięcej zgromadzonych środków.

package tydzien4.sobota;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Zadanie29Run
{
    public static void main(String[] args)
    {
        List <Zadanie28> accounts = new ArrayList<>();
        accounts.add(new Zadanie28(2000,"PLN"));
        accounts.add(new Zadanie28(2300,"PLN"));
        accounts.add(new Zadanie28(3000,"PLN"));
        accounts.add(new Zadanie28(7000,"PLN"));
        accounts.add(new Zadanie28(5000,"PLN"));
        accounts.add(new Zadanie28(7500,"PLN"));
        accounts.add(new Zadanie28(10000,"WOJTEK"));

//        TAK TEZ DZIALA
//        Zadanie28 biggest = accounts.stream()
//                .max (Comparator.comparingInt(p -> p.balance))
//                .get();
//        System.out.println(biggest.balance);


        Optional <Zadanie28> max = accounts.stream()
                .max((bal1 , bal2) ->Integer.compare(bal1.balance, bal2.balance));

        System.out.println("najwiecej kasy ma: " + max.get().name + " - " + max.get().balance);
    }
}
