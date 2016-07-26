package pl.parser.nbp.wyjatki;

import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class WyjatekBladDanychWejsciowych extends Throwable {

    private static final String WIADOMOSC_DOMYSLNA = "Nie podano danych wejsciowych!";
    public WyjatekBladDanychWejsciowych () {
        pokazWiadomosc(WIADOMOSC_DOMYSLNA);
    }

    public WyjatekBladDanychWejsciowych(String wiadomosc) {
        pokazWiadomosc(wiadomosc);
    }

    private void pokazWiadomosc(String wiadomosc) {
        Logger.getLogger(WyjatekBladDanychWejsciowych.class.getName()).severe(wiadomosc);
    }


}
