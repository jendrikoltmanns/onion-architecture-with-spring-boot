package bestellung.services;

import bestellung.persistence.repositories.BestellungRepository;
import mailing.external.smtp.EmailService;

class BestellungAusbuchenApplicationService {

    private final BestellungRepository bestellungRepository;
    private final EmailService emailService;

    public void ausbuchen(String id) {
        bestellungRepository.delete();

        emailService.send();
    }
}
