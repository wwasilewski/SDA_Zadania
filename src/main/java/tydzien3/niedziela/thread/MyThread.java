package tydzien3.niedziela.thread;

public class MyThread extends Thread
{
    int counter = 0;

    @Override
    public void run() {
        try {
            while (counter < 5) {
                System.out.println("Hello from Mars");
                counter++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
