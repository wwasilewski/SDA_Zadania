//Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
//hello world.

package Programowanie1.tydzien1.niedziela.Watki;

public class Watki_1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world");
    }
}
