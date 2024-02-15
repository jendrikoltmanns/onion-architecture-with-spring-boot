package bestellung.services;

import bestellung.persistence.repositories.BestellungRepository;
import lombok.RequiredArgsConstructor;
import mailing.sending.smtp.EmailService;

@RequiredArgsConstructor
class BestellungAusbuchenApplicationService {

    private final BestellungRepository bestellungRepository;

    public void ausbuchen(String id) {
        bestellungRepository.delete();

    }
}
