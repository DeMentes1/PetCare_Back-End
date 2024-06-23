package pe.upc.petcarebackend.management.domain.services;

import pe.upc.petcarebackend.management.domain.model.aggregates.Pet;
import pe.upc.petcarebackend.management.domain.model.queries.GetPetByIdQuery;

import java.util.Optional;

public interface PetQueryService {
    Optional<Pet> handle(GetPetByIdQuery query);

}
