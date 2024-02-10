package dev.acelera.api.client;

public record UserRegistrationData(
    String nome,
    String dataDeNascimento,
    String cpf,
    String cep
) {
}
