package dev.acelera.api.product;

import dev.acelera.api.sales.Sale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "products")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;
    private BigDecimal preco;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

    public Product(ProductResgistrationData data) {
        this.codigo = data.codigo();
        this.nome = data.nome();
        this.preco = data.preco();
    }

    public void updateData(ProductUpdateData data) {
        if (data.codigo() != null) {
            this.codigo = data.codigo();
        }
        if (data.nome() != null) {
            this.nome = data.nome();
        }
        if (data.preco() != null) {
            this.preco = data.preco();
        }
    }
}
