package pe.upc.petcarebackend.users.domain.model.queries;

import pe.upc.petcarebackend.users.domain.model.valueobjects.EmailAddress;

public record GetProfileByEmailQuery(EmailAddress email) { }
