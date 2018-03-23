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

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.apache.commons.lang3.StringUtils.stripAccents;

public class TextStats {

    public String readLineByLine(String path) {
        StringBuilder sb = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
            stream.forEach(s -> sb.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public double countWords(String path) {
        String string = readLineByLine(path);
        String allWords[] = string.split("\\s+");
        return allWords.length;
    }

    public double countSentences(String path) {
        String string = readLineByLine(path);
        String allWords[] = string.split("(\\.|\\?|\\!)");
        return allWords.length;
    }

    public String removeAccents(String text) {
        return stripAccents(text).replace('ł', 'l').replace('Ł', 'L');
    }

    public double countVowels(String path) {
        double vowels = 0;
        char ch;
        String string = readLineByLine(path);
        string = removeAccents(string).toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                vowels++;
            }
        }
        return vowels;
    }

    public double countConsonants(String path) {
        double cons = 0;
        char ch;
        String string = readLineByLine(path);
        string = removeAccents(string).toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if ((ch >= 'a' && ch <= 'z') && (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y')) {
                cons++;
            }
        }
        return cons;
    }

    public double countWhiteChars(String path) {
        double whiteCh = 0;
        char ch;
        String string = readLineByLine(path);

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (ch == '\n' || ch == '\r' || ch == '\t' || ch == ' ') {
                whiteCh++;
            }
        }
        return whiteCh;
    }
}
