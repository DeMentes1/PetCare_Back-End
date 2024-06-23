package pe.upc.petcarebackend.users.interfaces.rest.resources;

public record CreateProfileResource (
        String name,
        String email,
        String city) { }
