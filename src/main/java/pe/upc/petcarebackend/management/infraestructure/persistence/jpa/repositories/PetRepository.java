package pe.upc.petcarebackend.management.infraestructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.petcarebackend.management.domain.model.aggregates.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    boolean existsByName(String name);
}
