//Napisz program, który oblicza n-ty wyraz silni za pomocą rekurencji. Napisz również
//program bez rekurencji i porównaj czas wykonania.

package Programowanie1.tydzien4.sobota.Zadania014.ex03;

public class FactorialRecurr {

    public long calculateRecurr(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateRecurr(n - 1);
        }
    }

    public long calculateIter(long n) {
        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
