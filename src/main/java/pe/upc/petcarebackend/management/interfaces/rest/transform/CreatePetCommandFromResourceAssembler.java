package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.commands.CreatePetCommand;
import pe.upc.petcarebackend.management.interfaces.rest.resources.CreatePetResource;

public class CreatePetCommandFromResourceAssembler {
    public static CreatePetCommand toCommandFromResource(CreatePetResource resource){
        return new CreatePetCommand(
                resource.name(),
                resource.lastname(),
                resource.age()
        );
    }
}
