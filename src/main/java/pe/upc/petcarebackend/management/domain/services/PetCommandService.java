package pe.upc.petcarebackend.management.domain.services;

import pe.upc.petcarebackend.management.domain.model.commands.CreatePetCommand;

public interface PetCommandService {
    Long handle(CreatePetCommand command);
}
