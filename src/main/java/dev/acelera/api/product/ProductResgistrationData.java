package dev.acelera.api.product;

import java.math.BigDecimal;

public record ProductResgistrationData(
        String codigo,
        String nome,
        BigDecimal preco
) {
}
