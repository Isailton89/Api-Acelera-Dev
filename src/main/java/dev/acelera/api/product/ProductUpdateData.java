package dev.acelera.api.product;

import java.math.BigDecimal;

public record ProductUpdateData(
        Long id,
        String codigo,
        String nome,
        BigDecimal preco
        ) {
}
