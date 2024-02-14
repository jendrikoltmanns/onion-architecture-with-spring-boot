package bestellung.external.csv;

import bestellung.domain.valueObjects.BestellListeDatei;

public interface BestellungFileReader {

    BestellListeDatei read(Ressource ressource);
}
