package dev.acelera.api.sales;

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

}
