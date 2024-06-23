package pe.upc.petcarebackend.management.domain.model.commands;

public record CreatePetOwnerCommand(String name, String email, String city) {
}
