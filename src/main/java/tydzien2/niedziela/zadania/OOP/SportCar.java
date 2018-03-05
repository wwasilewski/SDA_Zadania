package tydzien2.niedziela.zadania.OOP;

public class SportCar extends Car
{
    public SportCar(String producer, String model, String color, int seatsNumber, Engine engine)
    {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    public SportCar(String producer, String model, String color, int seatsNumber)
    {
        super(producer, model, color);
        this.seatsNumber = seatsNumber;
    }

    public static void main(String[] args) {
        SportCar spcar = new SportCar("Mercedes","SLR","silver",3);
        System.out.println(spcar.producer + spcar.model + spcar.color + spcar.seatsNumber);


    }
}
