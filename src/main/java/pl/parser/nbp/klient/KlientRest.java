package pl.parser.nbp.klient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import pl.parser.nbp.wyjatki.WyjatekBladZasobu;

/**
 * Created by Agi.
 */
public class KlientRest {
    private static final  int STATUS_OK = 200;

    public KlientRest() {
        inicjlizujKlienta();
    }

    private void inicjlizujKlienta() {

    }

    protected <T> T wyslijGet(String adresZasobu, Class<T> clazz) {
        Client klient = Client.create();
        ClientResponse response= Client.create()
                .resource(adresZasobu)
                .accept("application/xml","application/json")
                .get(ClientResponse.class);
        if(response.getStatus() != STATUS_OK) {
            throw new WyjatekBladZasobu(response.getStatus());
        } else {
            return response.getEntity(clazz);
        }
    }
}
