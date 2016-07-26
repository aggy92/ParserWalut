package pl.parser.nbp.obiekty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agi.
 */
public enum Waluta {
    USD("USD"), EUR("EUR"), CHF("CHF"), GBP("GBP");

    private String etykieta;

    private Waluta(String etykieta) {
        this.etykieta = etykieta;
    }

    public String getEtykieta() {
        return etykieta;
    }

    public static Waluta zwrocPoEtykiecie(String etykieta) {
        for(Waluta waluta : values()) {
            if(waluta.getEtykieta().equals(etykieta)) {
                return  waluta;
            }
        }
        return null;
    }
}
