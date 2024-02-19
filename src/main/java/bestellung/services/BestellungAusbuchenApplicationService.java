package bestellung.services;

import bestellung.persistence.repositories.BestellungRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mailing.sending.smtp.EmailService;

@RequiredArgsConstructor
class BestellungAusbuchenApplicationService {

    private final BestellungRepository bestellungRepository;

    @Transactional
    public void ausbuchen(String id) {


    }
}
