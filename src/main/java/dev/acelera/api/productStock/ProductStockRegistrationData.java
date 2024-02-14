package dev.acelera.api.productStock;

public record ProductStockRegistrationData(
        Long idProduto,
        int quantidade,
        String dataDaCompra
) {
}
