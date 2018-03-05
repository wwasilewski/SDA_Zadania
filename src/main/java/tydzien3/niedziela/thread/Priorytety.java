package tydzien3.niedziela.thread;

public class Priorytety
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("priorytet watku glownego przed zmiana: " + t.getPriority());

        t.setPriority(3);
        System.out.println("priorytet watku glownego po zmianie: " + t.getPriority());

        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("priorytet watku glownego dla MIN_PRIORITY: " + t.getPriority());

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priorytet watku glownego dla MAX_PRIORITY:  " + t.getPriority());

        t.setPriority(Thread.NORM_PRIORITY);
        System.out.println("priorytet watku glownego dla NORM_PRIORITY:  " + t.getPriority());

    }
}
