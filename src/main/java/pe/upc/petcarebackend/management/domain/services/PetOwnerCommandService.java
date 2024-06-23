package pe.upc.petcarebackend.management.domain.services;

import pe.upc.petcarebackend.management.domain.model.commands.CreatePetOwnerCommand;
import pe.upc.petcarebackend.management.domain.model.valueobjects.PetOwnerRecordId;

public interface PetOwnerCommandService {
    /*
    Long handle(ConfirmAppoinmentCommand command);
    Long handle(CancelAppoinmentCommand command);

     */
    PetOwnerRecordId handle(CreatePetOwnerCommand command);
}
