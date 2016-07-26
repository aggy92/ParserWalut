package pl.parser.nbp.klient;

import pl.parser.nbp.obiekty.Waluta;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class KlientNBP extends KlientRest {
    private static final String ADRES_API = "http://api.nbp.pl/api/exchangerates/rates/c/";
    private static final String FORMAT_XML = "?format=xml";
    public static final String SPLITERATPR = "/";

    public String zwrocKursyWaluty(Waluta waluta) {
        String adresZasobu = zbudujAdresZasobu(waluta.getEtykieta());
        return wyslijGet(adresZasobu, String.class);
    }

    public String zwrocKursyWgDat(Waluta waluta, Date dataOd, Date dataDo) {
        String adresZasobu = zbudujAdresZasobu(waluta.getEtykieta(), parsujDate(dataOd), parsujDate(dataDo));
        return wyslijGet(adresZasobu, String.class);
    }

    private String parsujDate(Date dataOd) {
        return new SimpleDateFormat("yyyy-MM-dd").format(dataOd);
    }

    private String zbudujAdresZasobu(String... parametry) {
        StringBuilder adresZasobu = new StringBuilder(ADRES_API);
        for(String parametr : parametry) {
            adresZasobu.append(parametr);
            adresZasobu.append(SPLITERATPR);
        }
        adresZasobu.append(FORMAT_XML);
        return adresZasobu.toString();
    }
}



