package tydzien1.niedziela;

public class Calka
{
		static double funkcja (double x)
		{
			return (2*x)/(x*x+3);
		}

	public static void main (String [] args)
		{
			long czas = System.nanoTime();
			double max = 4.0;
			double current = 0.0;
			double calka = 0;

			while(current < max)
			{
				calka += funkcja(current)*0.0001;
				current += 0.0001;
			}
			System.out.println("calka: " + calka);
			System.out.println("czas wykonania: " + (System.nanoTime()-czas));
		}
}
