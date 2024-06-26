package pe.upc.petcarebackend.iam.domain.model.aggregates;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import pe.upc.petcarebackend.iam.domain.model.entities.Role;
import pe.upc.petcarebackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User extends AuditableAbstractAggregateRoot<User> {


    public LocalDateTime updatedAt;
    public LocalDateTime createdAt;

    @Getter
    @NotBlank
    @Size(max = 50)
    @Column(unique = true)
    private String username;

    @Getter
    @NotBlank
    @Size(max = 120)
    private String password;

    @Getter
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.roles = new HashSet<>();
    }

    public User(String username, String password) {
        this();
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, List<Role> roles) {
        this(username, password);
        addRoles(roles);
    }

    public User addRole(Role role) {
        this.roles.add(role);
        return this;
    }

    public User addRoles(List<Role> roles) {
        var validatedRoles = Role.validateRoleSet(roles);
        this.roles.addAll(validatedRoles);
        return this;
    }
}
