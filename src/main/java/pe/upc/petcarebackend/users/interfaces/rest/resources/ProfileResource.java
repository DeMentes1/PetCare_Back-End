package pe.upc.petcarebackend.users.interfaces.rest.resources;

public record ProfileResource (
        Long id,
        String fullName,
        String email,
        String city) { }

