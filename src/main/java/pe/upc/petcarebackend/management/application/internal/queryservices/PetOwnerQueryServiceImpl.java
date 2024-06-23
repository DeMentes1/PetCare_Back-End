package pe.upc.petcarebackend.management.application.internal.queryservices;

import org.springframework.stereotype.Service;
import pe.upc.petcarebackend.management.domain.model.aggregates.PetOwner;
import pe.upc.petcarebackend.management.domain.model.queries.GetAllPetOwnersQuery;
import pe.upc.petcarebackend.management.domain.model.queries.GetPetOwnerByPetIdQuery;
import pe.upc.petcarebackend.management.domain.model.queries.GetPetOwnerByPetOwnerRecordIdQuery;
import pe.upc.petcarebackend.management.domain.model.queries.GetPetOwnerByProfileIdQuery;
import pe.upc.petcarebackend.management.domain.services.PetOwnerQueryService;
import pe.upc.petcarebackend.management.infraestructure.persistence.jpa.repositories.PetOwnerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PetOwnerQueryServiceImpl implements PetOwnerQueryService {

    private final PetOwnerRepository petOwnerRepository;

    public PetOwnerQueryServiceImpl(PetOwnerRepository petOwnerRepository) {this.petOwnerRepository = petOwnerRepository;}

    @Override
    public Optional<PetOwner> handle(GetPetOwnerByPetIdQuery query){return petOwnerRepository.findByPetId(query.petId());}

    @Override
    public Optional<PetOwner> handle(GetPetOwnerByProfileIdQuery query) {return petOwnerRepository.findByProfileId(query.profileId());}

    @Override
    public Optional<PetOwner> handle(GetPetOwnerByPetOwnerRecordIdQuery query) {
        return petOwnerRepository.findByPetOwnerRecordId(query.petOwnerRecordId());
    }

    @Override
    public List<PetOwner> handle(GetAllPetOwnersQuery query) { return petOwnerRepository.findAll();}

}
