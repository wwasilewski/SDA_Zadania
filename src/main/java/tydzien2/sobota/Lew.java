package tydzien2.sobota;

public class Lew extends Zwierze {
    public Lew(String nazwa) {
        super(nazwa);
    }

    public void dajGlos() {
        System.out.println(getNazwa() + "ryczy");
    }
    public int ileJe()
    {
        return 20*getNazwa().hashCode();
    }
}
