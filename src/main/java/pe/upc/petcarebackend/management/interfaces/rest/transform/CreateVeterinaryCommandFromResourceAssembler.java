package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.commands.CreateVeterinaryCommand;
import pe.upc.petcarebackend.management.interfaces.rest.resources.CreateVeterinaryResource;

public class CreateVeterinaryCommandFromResourceAssembler {
    public static CreateVeterinaryCommand toCommandFromResource(CreateVeterinaryResource resource) {
        return new CreateVeterinaryCommand(
                resource.name(),
                resource.email(),
                resource.city(),
                resource.description()
        );
    }
}
