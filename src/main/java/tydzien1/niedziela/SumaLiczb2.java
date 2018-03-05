package tydzien1.niedziela;

public class SumaLiczb2
{
	public static void main (String [] args)
	{
		int sum = 0;
		int suma = 0;

		while (sum < 101)
		{
			suma = suma+sum;
			sum++;
		}
		System.out.println(suma);
		System.out.println(suma/100d);


		sum = 0;
		suma = 0;

		do
		{
			suma = suma+sum;
			sum++;
		}
		while (sum < 101);
		System.out.println(suma);
		System.out.println(suma/100d);
	}
}