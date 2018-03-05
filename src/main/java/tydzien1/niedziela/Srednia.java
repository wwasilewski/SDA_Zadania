package tydzien1.niedziela;

public class Srednia
{
	static double srednia(double... liczba)
	{
		double wynik = 0;
		int counter = 0;
		for (int i = 0; i < liczba.length; i++)
		{
			wynik = wynik + liczba[i];
			counter++;
		}
		return wynik/counter;
	}

	public static void main (String [] args) //moze byc (String... args)
	{
		System.out.println(srednia(4,3,2));
		System.out.println(srednia(3,3,3,4.33,3.2));
	}
}