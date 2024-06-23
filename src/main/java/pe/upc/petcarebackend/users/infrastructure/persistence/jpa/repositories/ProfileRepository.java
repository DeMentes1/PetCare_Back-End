package pe.upc.petcarebackend.users.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.petcarebackend.users.domain.model.aggregates.Profile;
import pe.upc.petcarebackend.users.domain.model.valueobjects.City;
import pe.upc.petcarebackend.users.domain.model.valueobjects.EmailAddress;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByCity(City city);
    Optional<Profile> findByEmail(EmailAddress email);
    boolean existsByEmail(EmailAddress email);
}
