package dev.acelera.api.product;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "products")
@Entity(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private BigDecimal preco;
}
