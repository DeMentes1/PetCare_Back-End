package pe.upc.petcarebackend.management.infraestructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.petcarebackend.management.domain.model.aggregates.PetOwner;
import pe.upc.petcarebackend.management.domain.model.valueobjects.PetOwnerRecordId;
import pe.upc.petcarebackend.management.domain.model.valueobjects.ProfileId;

import java.util.Optional;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Long> {
    Optional<PetOwner> findByPetId(Long petId);
    Optional<PetOwner> findByPetOwnerRecordId(PetOwnerRecordId petOwnerId);
    Optional<PetOwner> findByProfileId(ProfileId profileId);
}
