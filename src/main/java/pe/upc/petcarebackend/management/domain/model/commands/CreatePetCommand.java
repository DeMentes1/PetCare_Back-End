package pe.upc.petcarebackend.management.domain.model.commands;

public record CreatePetCommand(String name, String lastname, Integer age) {
}
