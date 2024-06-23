package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.aggregates.Pet;
import pe.upc.petcarebackend.management.interfaces.rest.resources.PetResource;

public class PetResourceFromEntityAssembler {
    public static PetResource toResourceFromEntity(Pet entity) {
        return new PetResource(entity.getId(), entity.getName(), entity.getLastname(), entity.getAge());
    }
}
