package dev.acelera.api.client;

public record ClientRegistrationData(
    String nome,
    String dataDeNascimento,
    String cpf,
    String cep
) {
}
