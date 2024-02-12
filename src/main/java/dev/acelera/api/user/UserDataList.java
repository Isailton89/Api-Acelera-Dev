package dev.acelera.api.user;

import java.util.Date;

public record UserDataList(Long id, String nome, Date dataAniversario, int cpf, int cep) {
    public UserDataList(User user) {
        this(user.getId(), user.getNome(), user.getDataAniversario(), user.getCpf(), user.getCep());
    }
}
