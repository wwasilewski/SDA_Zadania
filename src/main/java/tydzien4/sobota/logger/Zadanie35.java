package tydzien4.sobota.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zadanie35
{
    public static void main(String[] args) {

        log.trace("komunikat trace");
        log.trace("komunikat trace2");
        log.debug("komunikat debug");
        log.info("komunikat info");
        log.info("komunikat info2");
        log.warn("komunikat warn");
        log.error("komunikat error");
    }
}
