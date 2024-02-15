package dev.acelera.api.user;

public record UserDataList(Long id, String nome, String dataNascimento, String cpf, int cep, HomeAddress endereco) {
    public UserDataList(User user) {
        this(user.getId(), user.getNome(), user.getDataNascimento(), user.getCpf(), user.getCep(), null);
    }
}
