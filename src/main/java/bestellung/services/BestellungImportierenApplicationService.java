package bestellung.services;

import bestellung.domain.valueObjects.BestellListeDatei;
import bestellung.external.csv.BestellungFileReader;
import bestellung.domain.entities.Bestellung;
import bestellung.persistence.repositories.BestellungRepository;

import java.util.List;

@RequiredArgs
class BestellungImportierenApplicationService {

    private final BestellungFileReader bestellungFileReader;
    private final BestellungRepository bestellungRepository;

    public void importieren(Resource resource) {
        BestellListeDatei bestellListeDatei = bestellungFileReader.read(resource);

        if (!bestellListeDatei.isValid()) {
            log.error()
        }

        List<Bestellung> bestellungen = bestellListeDatei.getZeilen();

        bestellungRepository.saveAll(bestellungen);
    }
}
