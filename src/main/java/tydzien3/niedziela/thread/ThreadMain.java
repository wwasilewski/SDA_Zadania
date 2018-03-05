package tydzien3.niedziela.thread;

public class ThreadMain
{
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new MyThread();
        //thread.setName("my thread displaying hello");

        System.out.println("starting thread");
        thread.start(); // dlatego mars jest na koncu bo watek potrzebuje iles czasu (nie od razu)
        thread.join();
        System.out.println("thread started");

        Thread thread1 = new Thread(new MyThread2());
        thread1.start();
        System.out.println("application ends");
    }
}
