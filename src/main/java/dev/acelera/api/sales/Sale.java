package dev.acelera.api.sales;

import dev.acelera.api.product.Product;
import dev.acelera.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "sales_mades")
@Entity(name = "Sale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "quantidade_de_produtos_comprados")
    private String qntProduComprados;
    @Column(name = "data_da_compra")
    private String dataCompra;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;
}
