package pe.upc.petcarebackend.management.domain.model.queries;

import pe.upc.petcarebackend.management.domain.model.valueobjects.ProfileId;

public record GetPetOwnerByProfileIdQuery(ProfileId profileId) {
}