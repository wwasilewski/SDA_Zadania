package tydzien3.sobota;

public class Zadanie16Run
{
    public static void main(String[] args)
    {
        (new Thread(new Zadanie16())).start();
        //to samo co wyzej
        Thread thread1 = new Thread(new Zadanie16());
        thread1.start();
    }
}
