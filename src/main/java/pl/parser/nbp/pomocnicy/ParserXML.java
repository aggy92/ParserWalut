package pl.parser.nbp.pomocnicy;

import pl.parser.nbp.obiekty.KursWaluty;
import pl.parser.nbp.obiekty.KursyWalut;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Agi.
 */
public class ParserXML {

    public static List<KursWaluty> parsujXML(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(KursyWalut.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader stringReader = new StringReader(xml);
            KursyWalut kursy = (KursyWalut) unmarshaller.unmarshal(stringReader);
            return kursy.getKursy();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
}
