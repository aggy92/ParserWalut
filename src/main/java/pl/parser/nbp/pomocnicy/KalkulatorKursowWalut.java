package pl.parser.nbp.pomocnicy;

import pl.parser.nbp.obiekty.DaneWyjsciowe;
import pl.parser.nbp.obiekty.KursWaluty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Agi.
 */
public class KalkulatorKursowWalut {
    public static DaneWyjsciowe zwrocObliczoneDaneWyjsciowe(List<KursWaluty> kursy) {
        DaneWyjsciowe daneWyjsciowe = new DaneWyjsciowe();
        daneWyjsciowe.setKursSredni(wyliczKursSredni(kursy, true));
        daneWyjsciowe.setOdchylenieStandardowe(wyliczOdchylenieStandardowe(kursy));
        return daneWyjsciowe;
    }

    private static BigDecimal wyliczKursSredni(List<KursWaluty> kursy, boolean czyKupno) {
        BigDecimal suma = new BigDecimal(0.00);
        for (KursWaluty kurs : kursy) {
            if(czyKupno) suma = suma.add(kurs.getKwotaKupna());
            else suma = suma.add(kurs.getKwotaSprzedazy());
        }
        return suma.divide(new BigDecimal(kursy.size()), 4);
    }

    private static BigDecimal wyliczOdchylenieStandardowe(List<KursWaluty> kursy) {
        BigDecimal odchylenie = new BigDecimal(0.0000);
        BigDecimal srednia = wyliczKursSredni(kursy, false);
        for(KursWaluty kurs : kursy) {
            BigDecimal r = kurs.getKwotaSprzedazy().subtract(srednia);
            BigDecimal d = r.multiply(r);
            odchylenie = odchylenie.add(d);
        }
        odchylenie = odchylenie.divide(new BigDecimal(kursy.size()));
        odchylenie = new BigDecimal(Math.sqrt(odchylenie.doubleValue())).setScale(4, BigDecimal.ROUND_CEILING);
        return odchylenie;
    }

}
