package tydzien1.sobota;

public class WypiszTablice
{
	public static void main (String [] args)
	{
		String imiona[] = {"Oj", "Uj", "Ej"};

		for (int i = 0; i < imiona.length; i++)
		{
			System.out.print(imiona[i] + " ");
		}
		System.out.println("");

		for (String x : imiona)
		{
			System.out.print(x + " ");
		}
		System.out.println("");

		int i = 0;
		while (i < imiona.length)
		{
			System.out.print(imiona[i] + " ");
			i++;
		}
	}
}