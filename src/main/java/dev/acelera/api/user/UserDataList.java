package dev.acelera.api.user;

import java.util.Date;

public record UserDataList(Long id, String nome, Date dataNascimento, String cpf, int cep) {
    public UserDataList(User user) {
        this(user.getId(), user.getNome(), user.getDataNascimento(), user.getCpf(), user.getCep());
    }
}
