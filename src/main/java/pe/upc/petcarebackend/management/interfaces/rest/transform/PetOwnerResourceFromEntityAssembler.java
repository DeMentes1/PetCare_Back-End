package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.aggregates.PetOwner;
import pe.upc.petcarebackend.management.interfaces.rest.resources.PetOwnerResource;

public class PetOwnerResourceFromEntityAssembler {
    public static PetOwnerResource toResourceFromEntity(PetOwner petOwner) {
        return new PetOwnerResource(
                petOwner.getOwnerRecordId(),
                petOwner.getProfileId(),
                petOwner.getPet() != null ? petOwner.getPet().getId() : 0L,
                petOwner.getStatus());
    }
}
