package dev.acelera.api.user;

import java.util.Date;

public record UserRegistrationData(
    String nome,
    Date dataAniversario,
    int cpf,
    int cep
) {
}
