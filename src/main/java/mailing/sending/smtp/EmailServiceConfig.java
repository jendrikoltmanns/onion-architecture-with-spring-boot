package mailing.sending.smtp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EmailServiceConfig {

    @Bean
    @Profile("development")
    public EmailService emailServiceFake() {
        return new EmailFakeService();
    }

    @Bean
    @Profile("local")
    public EmailService emailLocalService() {
        return new EmailLocalService();
    }

    @Bean
    @Profile("staging")
    public EmailService emailSendgridStagingService() {
        return new EmailSendgridService();
    }

    @Bean
    @Profile("production")
    public EmailService emailSendgridProductionService() {
        return new EmailSendgridService();
    }
}
