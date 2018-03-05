package tydzien1.niedziela;

public class Parzyste
{
	public static void main (String [] args)
	{
		for (int i = 1; i <= 20; i++)
		{
			if (i%3 == 0)
			{
				System.out.println(i + " - liczba podzielna przez 3");
			}
			else if (i%2 == 0)
			{
				System.out.println(i + " - liczba parzysta");
			}
			else
			{
				System.out.println(i + " - liczba nieparzysta");
			}
		}
	}
}