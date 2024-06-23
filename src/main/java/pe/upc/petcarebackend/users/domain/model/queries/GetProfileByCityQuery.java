package pe.upc.petcarebackend.users.domain.model.queries;

import pe.upc.petcarebackend.users.domain.model.valueobjects.City;

public record GetProfileByCityQuery(City city) {
}
