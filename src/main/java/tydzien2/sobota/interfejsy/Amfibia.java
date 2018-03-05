package tydzien2.sobota.interfejsy;

public class Amfibia implements Lodz, Pojazd
{

    @Override
    public void plyn()
    {
        System.out.println("amfibia plynie");
    }

    @Override
    public void jedz()
    {
        System.out.println("amfibia jedzie");
    }
}
