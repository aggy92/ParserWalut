package pl.parser.nbp.obiekty;

import java.math.BigDecimal;

/**
 * Created by Agi.
 */
public class DaneWyjsciowe {
    private BigDecimal odchylenieStandardowe;

    private BigDecimal kursSredni;

    public BigDecimal getOdchylenieStandardowe() {
        return odchylenieStandardowe;
    }

    public void setOdchylenieStandardowe(BigDecimal odchylenieStandardowe) {
        this.odchylenieStandardowe = odchylenieStandardowe;
    }

    public BigDecimal getKursSredni() {
        return kursSredni;
    }

    public void setKursSredni(BigDecimal kursSredni) {
        this.kursSredni = kursSredni;
    }
}
