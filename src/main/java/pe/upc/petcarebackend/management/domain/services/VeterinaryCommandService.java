package pe.upc.petcarebackend.management.domain.services;

import pe.upc.petcarebackend.management.domain.model.commands.CreateVeterinaryCommand;
import pe.upc.petcarebackend.management.domain.model.valueobjects.VeterinaryRecordId;

public interface VeterinaryCommandService {
    VeterinaryRecordId handle(CreateVeterinaryCommand command);
}
