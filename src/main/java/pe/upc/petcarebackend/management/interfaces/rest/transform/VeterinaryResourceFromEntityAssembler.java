package pe.upc.petcarebackend.management.interfaces.rest.transform;

import pe.upc.petcarebackend.management.domain.model.aggregates.Veterinary;
import pe.upc.petcarebackend.management.interfaces.rest.resources.VeterinaryResource;

public class VeterinaryResourceFromEntityAssembler {
    public static VeterinaryResource toResourceFromEntity(Veterinary veterinary) {
        return new VeterinaryResource(
                veterinary.getVeterinaryId(),
                veterinary.getProfileId(),
                veterinary.getStatus(),
                veterinary.getDescription());
    }
}
