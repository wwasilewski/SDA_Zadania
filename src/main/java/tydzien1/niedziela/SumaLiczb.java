package tydzien1.niedziela;

public class SumaLiczb
{
	public static void main (String [] args)
	{
		int sum = 0;
		int suma = 0;
		for (int i = 1; i < 101; i++)
		{
			//System.out.println(i);
			sum++;
			suma = suma + sum;
		}
		System.out.println(suma);
		System.out.println(suma/100d);
	}
}