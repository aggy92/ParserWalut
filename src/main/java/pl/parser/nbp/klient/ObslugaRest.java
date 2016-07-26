package pl.parser.nbp.klient;

import pl.parser.nbp.obiekty.DaneWejsciowe;
import pl.parser.nbp.wyjatki.WyjatekBladDanychWejsciowych;

/**
 * Created by Agi.
 */
public class ObslugaRest {
    public static String pobierzKursyWalut(DaneWejsciowe daneWejsciowe) throws  WyjatekBladDanychWejsciowych {
        if (daneWejsciowe.getWaluta() == null) throw new WyjatekBladDanychWejsciowych("Bledna wartosc waluty!");

        KlientNBP klient = new KlientNBP();

        if (daneWejsciowe.getDataPoczatkowa() == null) {
           return klient.zwrocKursyWaluty(daneWejsciowe.getWaluta());
        } else {
           return klient.zwrocKursyWgDat(daneWejsciowe.getWaluta(), daneWejsciowe.getDataPoczatkowa(), daneWejsciowe.getDataKoncowa());
        }
    }
}