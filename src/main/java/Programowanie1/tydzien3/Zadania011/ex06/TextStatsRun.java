//Przygotuj program, który jako argument podczas uruchamiania przyjmuje ścieżkę do
//pliku z tekstem a następnie oblicza następujące statystyki tekstu:
//a. Ilość wyrazów w tekście.
//b. Ilość Zdań w tekście.
//c. Ilość spółgłosek.
//d. Ilość samogłosek.
//e. Ilość białych znaków (przyjmijmy znak końca linii \n, znak powrotu karetki \r, znak tabulacji \t oraz spację).
//f. Średnią długość wyrazu.
//g. Średnią długość zdania.

package Programowanie1.tydzien3.Zadania011.ex06;

import java.util.Scanner;

public class TextStatsRun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide path to file: ");
        String path = sc.nextLine();

        TextStats ts = new TextStats();
//        System.out.println(ts.readLineByLine(path));
        System.out.println("words: " + ts.countWords(path));
        System.out.println("sentences: " + ts.countSentences(path));
        System.out.println("vowels: " + ts.countVowels(path));
        System.out.println("consonants: " + ts.countConsonants(path));
        System.out.println("whiteChars: " + ts.countWhiteChars(path));

        System.out.println("average word length: " + (ts.countVowels(path)+
                ts.countConsonants(path))/ts.countWords(path) + " letters");
        System.out.println("average sentence length: " +
                (ts.countWords(path)/ts.countSentences(path) + " words"));

        sc.close();
    }
}
