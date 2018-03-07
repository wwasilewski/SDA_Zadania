//Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
//hello world.

package Programowanie1.tydzien1.niedziela.Watki;

public class Watki_1Run {
    public static void main(String[] args) {

//      (new Thread(new Watki_1())).start(); - to samo co nizej
        Thread thread1 = new Thread(new Watki_1());
        thread1.start();
    }
}
