package bestellung.persistence.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BestellungRepositoryConfig {

    @Bean
    @Profile("development")
    public BestellungRepository bestellungFakeRepository() {
        return new BestellungFakeRepository();
    }

    @Bean
    @Profile("local")
    public BestellungRepository bestellungPostgreSqlLocalRepository() {
        return new BestellungPostgreSqlRepositoy();
    }

    @Bean
    @Profile("staging")
    public BestellungRepository bestellungPostgreSqlStagingRepository() {
        return new BestellungPostgreSqlRepositoy();
    }

    @Bean
    @Profile("production")
    public BestellungRepository bestellungPostgreSqlProductionRepository() {
        return new BestellungPostgreSqlRepositoy();
    }
}
