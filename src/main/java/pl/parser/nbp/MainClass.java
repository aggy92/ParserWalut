package pl.parser.nbp;

import pl.parser.nbp.klient.ObslugaRest;
import pl.parser.nbp.obiekty.DaneWejsciowe;
import pl.parser.nbp.obiekty.DaneWejscioweBuilder;
import pl.parser.nbp.obiekty.DaneWyjsciowe;
import pl.parser.nbp.obiekty.KursWaluty;
import pl.parser.nbp.pomocnicy.KalkulatorKursowWalut;
import pl.parser.nbp.pomocnicy.ParserXML;
import pl.parser.nbp.wyjatki.WyjatekBladDanychWejsciowych;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class MainClass {
    public static void main(String[] args) {
        if(args.length < 1 || args.length > 3) {
            Logger.getLogger(MainClass.class.getName()).severe("Bledna liczba parametrow!");
            return;
        }

        try {
           String xml =  ObslugaRest.pobierzKursyWalut(zbudujDaneWyjsciowe(args));
            List<KursWaluty> kursyWalut = ParserXML.parsujXML(xml);
            wyswietlDaneWyjsciowe(KalkulatorKursowWalut.zwrocObliczoneDaneWyjsciowe(kursyWalut));
        } catch (WyjatekBladDanychWejsciowych e) {
            e.printStackTrace();
        }
    }

    private static void wyswietlDaneWyjsciowe(DaneWyjsciowe daneWyjsciowe) {
        System.out.println(daneWyjsciowe.getKursSredni());
        System.out.println(daneWyjsciowe.getOdchylenieStandardowe());
    }

    private static DaneWejsciowe zbudujDaneWyjsciowe(String[] args) {
        DaneWejscioweBuilder builder = null;
        if(args.length > 0) {
            builder = new DaneWejscioweBuilder(args[0]);
        }

        if(args.length > 1) {
            builder.ustawDatePoczatkowa(args[1]);
        }

        if(args.length > 2) {
            builder.ustawDateKoncowa(args[2]);
        }
        return builder.build();
    }
}
