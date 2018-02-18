package no.ber.sofachamps.custom;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null)
            return Optional.of("system");
        else if (authentication.getPrincipal() instanceof String)
            return Optional.of((String) authentication.getPrincipal());
        else
            return Optional.of(((User) authentication.getPrincipal()).getUsername());
    }
}
