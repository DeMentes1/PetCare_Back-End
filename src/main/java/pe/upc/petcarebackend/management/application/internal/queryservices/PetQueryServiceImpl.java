package pe.upc.petcarebackend.management.application.internal.queryservices;

import org.springframework.stereotype.Service;
import pe.upc.petcarebackend.management.domain.model.aggregates.Pet;
import pe.upc.petcarebackend.management.domain.model.queries.GetPetByIdQuery;
import pe.upc.petcarebackend.management.domain.services.PetQueryService;
import pe.upc.petcarebackend.management.infraestructure.persistence.jpa.repositories.PetRepository;

import java.util.Optional;

@Service
public class PetQueryServiceImpl implements PetQueryService {

    private final PetRepository petRepository;

    public PetQueryServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Optional<Pet> handle(GetPetByIdQuery query) {
        return petRepository.findById(query.petId());
    }
}
