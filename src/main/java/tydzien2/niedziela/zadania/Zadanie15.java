//Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby wyświetlić datę w następującym formacie
//3 lutego 2018 roku, sobota 22:12:27

package tydzien2.niedziela.zadania;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Zadanie15 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();

        System.out.println(date.format(DateTimeFormatter.ofPattern("d MMMM yyyy 'roku,' EEEE HH:mm:ss", new Locale("pl"))));

//       Format formatter = new SimpleDateFormat("d MMMM yyyy, EEEE HH:mm:ss");
//       String today = formatter.format(new Date());
//       System.out.println(today);

    }
}
