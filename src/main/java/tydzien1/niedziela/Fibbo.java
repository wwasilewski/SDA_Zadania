// Napisz program, który wypisze 30 liczb z ciągu Fibonacciego (1,1,2,3,5,8,13,...)

package tydzien1.niedziela;

public class Fibbo
{
	public static void main (String [] args)
	{
		int liczby[] = new int[30];
		liczby[0] = 1;
		liczby[1] = 1;

		for (int i = 2; i < 30; i++)
		{
			liczby[i] = liczby[i-1] + liczby[i-2];
		}

		for (int i = 0; i < 30; i++)
		{
			System.out.println(liczby[i] + " - liczba nr: " + (i+1));
		}
	}
}