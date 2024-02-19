package mailing.sending.smtp;

import mailing.domain.valueObjects.Absender;
import mailing.domain.valueObjects.Betreff;

class EmailFakeService implements EmailService{

    @Override
    public void send(Absender absender, Betreff betreff) {

    }
}
