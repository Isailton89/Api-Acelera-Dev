package dev.acelera.api.user;

public record UserUpdateData(
        Long id,
        String nome,
        String dataNascimento,
        String cpf,
        int cep
) {
}
