package pe.upc.petcarebackend.users.application.internal.commandservices;

import org.springframework.stereotype.Service;
import pe.upc.petcarebackend.users.domain.model.aggregates.Profile;
import pe.upc.petcarebackend.users.domain.model.commands.CreateProfileCommand;
import pe.upc.petcarebackend.users.domain.model.valueobjects.EmailAddress;
import pe.upc.petcarebackend.users.domain.services.ProfileCommandService;
import pe.upc.petcarebackend.users.infrastructure.persistence.jpa.repositories.ProfileRepository;

import java.util.Optional;

@Service
public class ProfileCommandServiceImpl implements ProfileCommandService {
    private final ProfileRepository profileRepository;

    public ProfileCommandServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Optional<Profile> handle(CreateProfileCommand command) {
        var emailAddress = new EmailAddress(command.email());
        if (profileRepository.existsByEmail(emailAddress))
            throw new IllegalArgumentException("Profile with email "+ command.email() +"already exists");
        var profile = new Profile(command);
        profileRepository.save(profile);
        return Optional.of(profile);
    }
}
