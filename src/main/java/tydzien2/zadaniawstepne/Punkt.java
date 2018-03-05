package tydzien2.zadaniawstepne;

public class Punkt
{
    public static double x;
    public static double y;

    public Punkt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public static double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

//    public static String wypisz(double x, double y)
//    {
//        return ("obiekt to punkt: " + x + ", " + y);
//    }

    public double distance(Punkt other)
    {
        double x1 = this.x;
        double x2 = this.y;
        double y1 = other.getX();
        double y2 = other.getY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }

    public double sumX(Punkt... punkts)
    {
        double suma = 0.0;
        for (Punkt punk : punkts)
        {
            suma +=punk.getX();
        }
        return suma;
    }

    public static void main(String[] args)
    {
//        Punkt pierwszy = new Punkt(4,2);
//        Punkt drugi = new Punkt(2,6);

        Punkt punk1 = new Punkt(1,2);
        Punkt punk2 = new Punkt(1,2);
        Punkt punk3 = new Punkt(1,2);
        Punkt punk4 = new Punkt(2,2);


//      System.out.println(pierwszy.x + ", " + pierwszy.y);
//      System.out.println(wypisz(5,7));
//      System.out.println(wypisz(pierwszy.x,pierwszy.y));
//      System.out.println(wypisz(drugi.x,drugi.y));
        System.out.println(punk1.distance(punk3));
        System.out.println(punk3.distance(punk4));

        System.out.println("suma wszystkich " + punk1.sumX(punk2, punk4));

    }
}