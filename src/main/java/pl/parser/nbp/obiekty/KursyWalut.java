package pl.parser.nbp.obiekty;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Agi.
 */
@XmlRootElement(name = "ExchangeRatesSeries")
@XmlAccessorType(XmlAccessType.FIELD)
public class KursyWalut implements Serializable{

    @XmlElement(name = "Currency")
    private String waluta;

    @XmlElementWrapper(name = "Rates")
    @XmlElement(name = "Rate")
    private List<KursWaluty> kursy;

    public List<KursWaluty> getKursy() {
        return kursy;
    }

    public void setKursy(List<KursWaluty> kursy) {
        this.kursy = kursy;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }
}
