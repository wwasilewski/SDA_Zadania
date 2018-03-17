package Programowanie1.tydzien2.sobota.Ogolne;

import Programowanie1.tydzien2.sobota.Ogolne.Ogolne_2_PrimeNumber;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_2Test {
    @Test
    public void NumberIsPrime() {
        Ogolne_2_PrimeNumber zad2 = new Ogolne_2_PrimeNumber();
        int number = 5;
        Boolean result = zad2.isPrime(number);
        Assert.assertTrue("method does not work correctly", result == true);
    }

    @Test
    public void NumberIsNotPrime() {
        Ogolne_2_PrimeNumber zad2 = new Ogolne_2_PrimeNumber();
        int number = 4;
        Boolean result = zad2.isPrime(number);
        Assert.assertTrue("method does not work correctly", result == false);
    }
}
