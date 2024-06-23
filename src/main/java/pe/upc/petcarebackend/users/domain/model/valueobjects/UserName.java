package pe.upc.petcarebackend.users.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record UserName(String name) {
    public UserName() {
        this(null);
    }

    public UserName {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}