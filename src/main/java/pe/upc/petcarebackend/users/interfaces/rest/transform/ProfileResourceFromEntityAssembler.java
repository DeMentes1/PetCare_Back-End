package pe.upc.petcarebackend.users.interfaces.rest.transform;

import pe.upc.petcarebackend.users.domain.model.aggregates.Profile;
import pe.upc.petcarebackend.users.interfaces.rest.resources.ProfileResource;

public class ProfileResourceFromEntityAssembler {
    public static ProfileResource toResourceFromEntity(Profile entity){
        return new ProfileResource(
                entity.getId(),
                entity.getFullName(),
                entity.getEmailAddress(),
                entity.getCity());
    }
}
