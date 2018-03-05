package tydzien1.niedziela;

public class Varargsy
{
	static String scal(String... ss)
	{
		String wynik = "";
		for (int i = 0; i < ss.length; i++)
		{
			wynik = wynik + ss[i];
		}
		return wynik;
	}

	static int scal2(int... dd)
	{
		int wynik = 0;
		for (int i = 0; i < dd.length; i++)
		{
			wynik = wynik + dd[i];
		}
		//for (int liczba: dd)
		//{
		//	wynik = wynik + liczba;
		//}
		return wynik;
	}

	public static void main (String [] args) //moze byc (String... args)
	{
		System.out.println(scal("ble", " bla", " bli"));
		System.out.println(scal2(4,4,5,1,1));
	}
}