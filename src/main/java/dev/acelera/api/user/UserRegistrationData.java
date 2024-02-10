package dev.acelera.api.user;

public record UserRegistrationData(
    String nome,
    String dataDeNascimento,
    String cpf,
    String cep
) {
}
