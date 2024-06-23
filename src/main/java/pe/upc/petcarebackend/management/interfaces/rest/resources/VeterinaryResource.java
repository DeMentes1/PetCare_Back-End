package pe.upc.petcarebackend.management.interfaces.rest.resources;

public record VeterinaryResource(String veterinaryRecordId, Long profileId, String status, String description) {
}
