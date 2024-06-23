package pe.upc.petcarebackend.users.domain.services;

import pe.upc.petcarebackend.users.domain.model.aggregates.Profile;
import pe.upc.petcarebackend.users.domain.model.queries.GetAllProfilesQuery;
import pe.upc.petcarebackend.users.domain.model.queries.GetProfileByCityQuery;
import pe.upc.petcarebackend.users.domain.model.queries.GetProfileByEmailQuery;
import pe.upc.petcarebackend.users.domain.model.queries.GetProfileByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProfileQueryService {
    List<Profile> handle(GetAllProfilesQuery query);
    Optional<Profile> handle(GetProfileByIdQuery query);
    Optional<Profile> handle(GetProfileByCityQuery query);
    Optional<Profile> handle(GetProfileByEmailQuery query);
}
