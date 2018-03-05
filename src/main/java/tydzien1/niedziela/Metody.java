package tydzien1.niedziela;

public class Metody {

	static int suma(int a, int b)
	{
		return a + b;
	}

	static void wypisz(String s)
	{
		System.out.println(s);
	}

	static long czas()
	{
		return System.currentTimeMillis();
	}


	public static void main(String[] args)
	{
		int wynik = suma(3,4);
		System.out.println(wynik);
		System.out.println(suma(5, 6));
		wypisz("test");
		System.out.println(czas());
		long teraz = czas();
		wypisz(teraz + " Hello " + wynik);
	}
}