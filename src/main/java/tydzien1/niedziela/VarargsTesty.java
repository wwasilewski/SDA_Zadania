package tydzien1.niedziela;

public class VarargsTesty
{
	static int suma(int... liczba)
	{
		int wynik = 0;
		for (int i = 0; i < liczba.length; i++)
		{
			wynik = wynik + liczba[i];
		}
		return wynik;
	}

	static int suma2(int... liczba2)
	{
		int wynik2 = 0;
		for (int sum : liczba2)
		{
			wynik2 = wynik2 + sum;
		}
		return wynik2;
	}

	static String wyrazy(String... wyraz)
	{
		String ciag = "";
		for (int i = 0; i < wyraz.length; i++)
		{
			ciag = ciag + wyraz[i] + " \n";
		}
		return ciag;
	}

	static String wyrazy2(String... wyraz2)
	{
		String ciag2 = "";
		for (String fin : wyraz2)
		{
			ciag2 = ciag2 + fin;
		}
		return ciag2;
	}

	public static void main (String [] args) //moze byc (String... args)
	{
		System.out.println(suma(3,4,2,2,3,3,3,3));
		System.out.println(suma2(3,1,2,3,2));
		System.out.println(wyrazy("AAA","BBB","CCC"));
		System.out.println(wyrazy2("aaa","bbb","ccc"));
	}
}