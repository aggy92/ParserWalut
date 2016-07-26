package pl.parser.nbp.wyjatki;

import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class WyjatekBladZasobu extends RuntimeException {
    Logger log = Logger.getLogger(WyjatekBladZasobu.class.getName());
    public WyjatekBladZasobu(int status) {
        log.severe("Nieprawidlowa odpowiedz zasobu "+status);
    }
}
