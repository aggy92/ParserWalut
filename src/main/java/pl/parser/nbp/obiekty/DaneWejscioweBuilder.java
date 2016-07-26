package pl.parser.nbp.obiekty;

import java.util.Date;

/**
 * Created by Agi.
 */
public class DaneWejscioweBuilder {
    private String waluta;

    private String dataPoczatkowa;

    private String dataKoncowa;

    public DaneWejscioweBuilder(String waluta) {
        this.waluta = waluta;
    }

    public DaneWejscioweBuilder ustawDatePoczatkowa(String dataPoczatkowa) {
        this.dataPoczatkowa = dataPoczatkowa;
        return this;
    }

    public DaneWejscioweBuilder ustawDateKoncowa(String dataKoncowa) {
        this.dataKoncowa = dataKoncowa;
        return this;
    }

    public String getWaluta() {
        return waluta;
    }

    public String getDataPoczatkowa() {
        return dataPoczatkowa;
    }

    public String getDataKoncowa() {
        return dataKoncowa;
    }

    public DaneWejsciowe build() {
        return new DaneWejsciowe(this);
    }

}
