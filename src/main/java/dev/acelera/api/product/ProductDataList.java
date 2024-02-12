package dev.acelera.api.product;

import java.math.BigDecimal;

public record ProductDataList(Long id, String codigo, BigDecimal preco) {
    public ProductDataList(Product product) {
        this(product.getId(), product.getCodigo(), product.getPreco());
    }
}
