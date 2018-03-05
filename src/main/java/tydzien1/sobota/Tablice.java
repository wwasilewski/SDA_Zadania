package tydzien1.sobota;

public class Tablice
{
	public static void main (String [] args) 
	{

		int tablica [] = new int[5];
		tablica[0] = 1;
		tablica[1] = 3;
		tablica[2] = 5;
		tablica[3] = 7;
		tablica[4] = 9;

		System.out.println(tablica[2] + tablica[3]);

		int tab2[] = {2,4,6,8,10};

		System.out.println(tab2[2] + tab2[3]);

		System.out.println(tab2.length);

		int tab3 [][] = new int[3][2];
		tab3 [0][0] = 1;
		tab3 [0][1] = 3;
		tab3 [1][0] = 5;
		tab3 [1][1] = 7;
		tab3 [2][0] = 9;
		tab3 [2][1] = 11;

		System.out.println(tab3.length);
		System.out.println(tab3[0].length);

		int tab4 [][] = {	{1},
							{2,3},
							{4},
							{1,2,3,4} };
		//System.out.println(tab4[0][2]); poza zakresem

		String imiona[] = {"Tomek","Wojtek","Marek","Anna"};
		System.out.println(imiona[0]+imiona[1]+imiona[2]+imiona[3]);

		int tab5 [][] = {		{9,8,7},
								{1,2,7},
								{4,9,2},
								{6,0,5} };

		System.out.println(tab5[0][0] + " " + tab5[0][1] + " " + tab5[0][2] );
		System.out.println(tab5[1][0] + " " + tab5[1][1] + " " + tab5[1][2] );
		System.out.println(tab5[2][0] + " " + tab5[2][1] + " " + tab5[2][2] );
		System.out.println(tab5[3][0] + " " + tab5[3][1] + " " + tab5[3][2] );

	}
}