package mailing.sending.smtp;

import mailing.domain.valueObjects.Absender;
import mailing.domain.valueObjects.Betreff;

public interface EmailService {
    void send(Absender absender, Betreff betreff);
}
