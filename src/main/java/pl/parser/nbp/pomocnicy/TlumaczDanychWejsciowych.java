package pl.parser.nbp.pomocnicy;

import pl.parser.nbp.obiekty.Waluta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class TlumaczDanychWejsciowych {
    private static final String FORMAT_DATY = "yyyy-MM-dd";

    public static Waluta zwrocWalute(String waluta) {
        return Waluta.zwrocPoEtykiecie(waluta);
    }

    public static Date zwrocDate(String data) {
        if(data == null) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATY);
        try {
            return sdf.parse(data);
        } catch (ParseException e) {
            Logger.getLogger(TlumaczDanychWejsciowych.class.getName()).severe("Bledny format daty! Prawidlowy format to: "+FORMAT_DATY);
            return null;
        }
    }
}