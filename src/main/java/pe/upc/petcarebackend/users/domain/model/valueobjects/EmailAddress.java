package pe.upc.petcarebackend.users.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public record EmailAddress(@Email String address) {
    public EmailAddress() {
        this(null);
    }
}

