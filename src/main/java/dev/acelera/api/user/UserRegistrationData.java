package dev.acelera.api.user;

public record UserRegistrationData(
    String nome,
    String dataNascimento,
    String cpf,
    int cep
) {
}
