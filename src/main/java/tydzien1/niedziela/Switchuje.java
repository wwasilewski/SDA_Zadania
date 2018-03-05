package tydzien1.niedziela;

public class Switchuje
{
	public static void main (String [] args)
	{
		int zmienna = 4;

		switch(zmienna)
		{
			case 1:
				System.out.println("jedynka");
				break;
			case 2:
				System.out.println("dwojka");
				break;
			case 3:
				System.out.println("trojka");
				break;

			default:
				System.out.println("podales liczbe ktorej nie ma w kejsie");
		}
	}
}