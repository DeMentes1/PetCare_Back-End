package pe.upc.petcarebackend.management.domain.model.commands;

public record CreateVeterinaryCommand(String name, String email, String city, String description) {
}
