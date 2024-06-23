package pe.upc.petcarebackend.management.infraestructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.petcarebackend.management.domain.model.aggregates.Veterinary;
import pe.upc.petcarebackend.management.domain.model.valueobjects.ProfileId;
import pe.upc.petcarebackend.management.domain.model.valueobjects.VeterinaryRecordId;

import java.util.Optional;

@Repository
public interface VeterinaryRepository extends JpaRepository<Veterinary, Long> {
    Optional<Veterinary> findByVeterinaryRecordId(VeterinaryRecordId veterinaryRecordId);
    Optional<Veterinary> findByProfileId(ProfileId profileId);
}
