package pl.parser.nbp.obiekty;

import pl.parser.nbp.pomocnicy.TlumaczDanychWejsciowych;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Agi.
 */
public class DaneWejsciowe {

    private Waluta waluta;

    private Date dataPoczatkowa;

    private Date dataKoncowa;


    public DaneWejsciowe(DaneWejscioweBuilder builder){
        ustawDaneWejsciowe(builder.getWaluta(), builder.getDataPoczatkowa(), builder.getDataKoncowa());
    }

    private void ustawDaneWejsciowe(String waluta, String dataPoczatkowa, String dataKoncowa){
        this.waluta = TlumaczDanychWejsciowych.zwrocWalute(waluta);
        this.dataPoczatkowa = TlumaczDanychWejsciowych.zwrocDate(dataPoczatkowa);
        this.dataKoncowa = TlumaczDanychWejsciowych.zwrocDate(dataKoncowa);
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public Date getDataPoczatkowa() {
        return dataPoczatkowa;
    }

    public void setDataPoczatkowa(Date dataPoczatkowa) {
        this.dataPoczatkowa = dataPoczatkowa;
    }

    public Date getDataKoncowa() {
        return dataKoncowa;
    }

    public void setDataKoncowa(Date dataKoncowa) {
        this.dataKoncowa = dataKoncowa;
    }
}