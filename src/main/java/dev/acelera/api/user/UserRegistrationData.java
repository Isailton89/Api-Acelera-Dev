package dev.acelera.api.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserRegistrationData(
    @NotBlank
    String nome,
    @NotBlank
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])(?:/(0[1-9]|1[0-2]))?/\\d{4}$")
    String dataNascimento,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf,
    int cep
) {
}
