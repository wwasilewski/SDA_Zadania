package tydzien1.sobota;

public class KonwersjeTypow
{
	public static void main (String [] args) 
	{
		short s = 100;
		int z = s;

//		int a = 200;
//		short b = a;
//		System.out.println(b); - blad konwersji - utrata danych

		System.out.println(z);

		short x = 100;
		long y = x;

		int x2 = 100;
		float y2 = x2;
		System.out.println(y2);

		long x5 = 200;
		//int y5 = x5;
		//System.out.println(y5);

//		short x6 = 14;
//		byte y6 = x6;
//		System.out.println(y6); - blad konwersji utrata danych

		char x7 = 'A';
		int y7 = x7;
		System.out.println(y7);

	}
}