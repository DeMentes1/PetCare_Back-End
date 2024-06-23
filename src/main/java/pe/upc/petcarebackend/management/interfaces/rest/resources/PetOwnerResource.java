package pe.upc.petcarebackend.management.interfaces.rest.resources;

public record PetOwnerResource(String petOwnerRecordId, Long profileId, Long petId, String status) {
}
