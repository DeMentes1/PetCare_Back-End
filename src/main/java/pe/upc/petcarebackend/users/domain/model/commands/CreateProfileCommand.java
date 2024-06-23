package pe.upc.petcarebackend.users.domain.model.commands;

public record CreateProfileCommand(String name, String email, String city){}
