package pl.parser.nbp.obiekty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Agi.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class KursWaluty implements Serializable {

    @XmlElement(name = "EffectiveDate")
    private Date dataPublikacji;

    @XmlElement(name = "Bid")
    private BigDecimal kwotaKupna;

    @XmlElement(name = "Ask")
    private BigDecimal kwotaSprzedazy;

    public Date getDataPublikacji() {
        return dataPublikacji;
    }

    public void setDataPublikacji(Date dataPublikacji) {
        this.dataPublikacji = dataPublikacji;
    }

    public BigDecimal getKwotaKupna() {
        return kwotaKupna;
    }

    public void setKwotaKupna(BigDecimal kwotaKupna) {
        this.kwotaKupna = kwotaKupna;
    }

    public BigDecimal getKwotaSprzedazy() {
        return kwotaSprzedazy;
    }

    public void setKwotaSprzedazy(BigDecimal kwotaSprzedazy) {
        this.kwotaSprzedazy = kwotaSprzedazy;
    }
}
