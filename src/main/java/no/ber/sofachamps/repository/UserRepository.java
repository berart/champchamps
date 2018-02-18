package no.ber.sofachamps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import no.ber.sofachamps.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
