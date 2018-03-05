package tydzien4.sobota;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Zadanie28Run
{
    public static void main(String[] args) {

//        Zadanie28 bankAccount1 = new Zadanie28(1000,"PLN");
//        Zadanie28 bankAccount2 = new Zadanie28(2000,"PLN");
//        Zadanie28 bankAccount3 = new Zadanie28(3000,"PLN");
//        Zadanie28 bankAccount4 = new Zadanie28(4000,"PLN");
//        Zadanie28 bankAccount5 = new Zadanie28(5000,"PLN");
//        Zadanie28 bankAccount6 = new Zadanie28(7500,"PLN");
//        Zadanie28 bankAccount7 = new Zadanie28(100000,"PLN");

        List <Zadanie28> accounts = new ArrayList<>();
        accounts.add(new Zadanie28(1000,"PLN"));
        accounts.add(new Zadanie28(2000,"PLN"));
        accounts.add(new Zadanie28(3000,"PLN"));
        accounts.add(new Zadanie28(4000,"PLN"));
        accounts.add(new Zadanie28(5000,"PLN"));
        accounts.add(new Zadanie28(7500,"PLN"));
        accounts.add(new Zadanie28(10000,"PLN"));

        List <Zadanie28> filteredAccounts = accounts.stream()
                    .filter (account -> account.balance > 5000)
                    .collect (Collectors.toList());

        filteredAccounts.forEach (account -> System.out.println(account.balance));

    }
}
