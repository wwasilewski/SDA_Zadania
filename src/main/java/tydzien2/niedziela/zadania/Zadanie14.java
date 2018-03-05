package tydzien2.niedziela.zadania;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Zadanie14
{
    public static void main(String[] args) {
        LocalDateTime here = LocalDateTime.now();
        LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("biezacy czas i data tu: " + here);
        System.out.println("biezacy czas i data w Tokio: " + tokyo);
    }
}
