package dev.acelera.api.productStock;

import dev.acelera.api.sales.Sale;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "products_stock")
@Entity(name = "ProductStock")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProductStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_produto")
    private Long idProduto;
    private int quantidade;
    @Column(name = "data_da_compra")
    private String dataDaCompra;

    public ProductStock(Long idProduto, ProductStockRegistrationData data) {
        this.idProduto = idProduto;
        this.quantidade = data.quantidade();
        this.dataDaCompra = data.dataDaCompra();
    }
}
