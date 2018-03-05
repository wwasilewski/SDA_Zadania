package tydzien2.sobota;

public class Slon extends Zwierze {
    public Slon(String nazwa) {
        super(nazwa);
    }

    public void dajGlos()
    {
        System.out.println(getNazwa());
    }

    public int ileJe()
    {
        return 20*getNazwa().hashCode();
    }
}

