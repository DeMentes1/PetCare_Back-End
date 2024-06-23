package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.commands.CreatePetOwnerCommand;
import pe.upc.petcarebackend.management.interfaces.rest.resources.CreatePetOwnerResource;

public class CreatePetOwnerCommandFromResourceAssembler {
    public static CreatePetOwnerCommand toCommandFromResource(CreatePetOwnerResource resource) {
        return new CreatePetOwnerCommand(
                resource.name(),
                resource.email(),
                resource.city()
        );
    }
}

