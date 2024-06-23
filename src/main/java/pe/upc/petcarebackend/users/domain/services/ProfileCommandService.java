package pe.upc.petcarebackend.users.domain.services;

import org.springframework.stereotype.Service;
import pe.upc.petcarebackend.users.domain.model.aggregates.Profile;
import pe.upc.petcarebackend.users.domain.model.commands.CreateProfileCommand;

import java.util.Optional;

@Service
public interface ProfileCommandService{
    Optional<Profile> handle(CreateProfileCommand command);
}
