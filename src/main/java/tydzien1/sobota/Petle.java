package tydzien1.sobota;

public class Petle
{
	public static void main (String [] args) 
	{
		String imie[] = { "Wojtek", "Tomek", "Marek", "Ania"};

		int licznik = 0;
		while (licznik < 4)
		{
			System.out.println("while " + imie[licznik]);
			licznik++;
		}


		licznik = 0;
		do
		{
			System.out.println("do-while " + imie[licznik]);
			licznik++;
		}
		while (licznik < imie.length);


		for (int i = 0; i < 10; i++)
		{
			System.out.println("for nr " + i);
		}


		String kolory[] = {"bialy", "czarny", "zielony"};
		for (String kolor : kolory)
		{
			System.out.println("kolor " + kolor);
		}


		String imiona2[][] = {
								{"imie1", "imie2"},
								{"imie4", "imie5", "imie6"} };

		for (String[] wew : imiona2)
		{
			for (String imie2: wew)
			{
				System.out.println(imie2 + " ");
			}
		}
		//System.out.println("\n");

	}
}