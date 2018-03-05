package tydzien4.sobota.logger;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Zadanie33i34
{
    public static void main(String[] args) {

        log.info("start aplikacji");
        System.out.print("podaj imie: ");
        String imie = "";

        Scanner scan = new Scanner(System.in);
        imie = scan.nextLine();

        log.info(imie);

        log.info("koniec aplikacji");

    }
}
