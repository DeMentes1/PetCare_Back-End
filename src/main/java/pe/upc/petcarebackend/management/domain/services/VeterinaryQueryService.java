package pe.upc.petcarebackend.management.domain.services;

import pe.upc.petcarebackend.management.domain.model.aggregates.Veterinary;
import pe.upc.petcarebackend.management.domain.model.queries.GetAllVeterinariesQuery;
import pe.upc.petcarebackend.management.domain.model.queries.GetVeterinaryByProfileIdQuery;
import pe.upc.petcarebackend.management.domain.model.queries.GetVeterinaryByVeterinaryRecordIdQuery;

import java.util.List;
import java.util.Optional;

public interface VeterinaryQueryService {
    List<Veterinary> handle(GetAllVeterinariesQuery query);
    Optional<Veterinary> handle(GetVeterinaryByVeterinaryRecordIdQuery query);
    Optional<Veterinary> handle(GetVeterinaryByProfileIdQuery query);
}
