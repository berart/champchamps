package no.ber.champchamps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import no.ber.champchamps.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
