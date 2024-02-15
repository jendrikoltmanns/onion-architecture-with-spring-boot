package bestellListeDatei.reader.csv;

import bestellListeDatei.domain.valueObjects.BestellListeDatei;

public interface BestellListeDateiReader {

    BestellListeDatei read(Ressource ressource);
}
