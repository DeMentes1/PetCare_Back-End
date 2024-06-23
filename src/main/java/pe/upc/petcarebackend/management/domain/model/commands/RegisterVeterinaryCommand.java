package pe.upc.petcarebackend.management.domain.model.commands;

public record RegisterVeterinaryCommand(String name, String address, Long phone, String email) {
}
