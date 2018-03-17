//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy wprowadzona
//liczba jest liczbą pierwszą. Program wyświetla komunikat
//“Podana liczba <liczba> jest liczbą pierwszą”
//lub “Podana liczba <liczba> nie jest liczbą pierwszą”

package Programowanie1.tydzien2.sobota.Ogolne;

public class Ogolne_2_PrimeNumber {
    public Boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
