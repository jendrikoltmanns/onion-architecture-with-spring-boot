package mailing.external.smtp;

import mailing.domain.valueObjects.Absender;
import mailing.domain.valueObjects.Betreff;

class FakeEmailService implements EmailService{

    @Override
    public void send(Absender absender, Betreff betreff) {

    }
}