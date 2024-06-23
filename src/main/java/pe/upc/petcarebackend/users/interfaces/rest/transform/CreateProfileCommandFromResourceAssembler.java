package pe.upc.petcarebackend.users.interfaces.rest.transform;

import pe.upc.petcarebackend.users.domain.model.commands.CreateProfileCommand;
import pe.upc.petcarebackend.users.interfaces.rest.resources.CreateProfileResource;

public class CreateProfileCommandFromResourceAssembler {
    public static CreateProfileCommand toCommandFromResource(CreateProfileResource resource){
        return new CreateProfileCommand(
                resource.name(),
                resource.email(),
                resource.city()
                );
    }
}
