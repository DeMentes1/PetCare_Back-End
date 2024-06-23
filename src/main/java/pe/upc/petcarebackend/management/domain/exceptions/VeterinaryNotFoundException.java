package pe.upc.petcarebackend.management.domain.exceptions;

public class VeterinaryNotFoundException extends RuntimeException {

    public VeterinaryNotFoundException (Long aLong) {
        super("Veterinary with id " + aLong + " not found");
    }
}
