package pe.upc.petcarebackend.iam.domain.model.commands;

import pe.upc.petcarebackend.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
