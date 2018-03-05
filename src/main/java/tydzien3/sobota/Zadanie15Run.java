package tydzien3.sobota;

public class Zadanie15Run
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Zadanie15();
        thread.setName("nowy watek");
        thread.start();
        thread.join();
        System.out.println(thread.currentThread());
    }
}
