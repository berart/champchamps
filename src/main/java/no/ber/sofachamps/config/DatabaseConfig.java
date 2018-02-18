package no.ber.sofachamps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import no.ber.sofachamps.custom.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing
public class DatabaseConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }
}