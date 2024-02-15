package dev.acelera.api.user;

import dev.acelera.api.sales.Sale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private int cep;

    @OneToMany(mappedBy = "user")
    private List<Sale> sales;

    public User(UserRegistrationData data) {
        this.nome = data.nome();
        this.dataNascimento = data.dataNascimento();
        this.cpf = data.cpf();
        this.cep = data.cep();
    }

    public void updateData(UserUpdateData data) {
        if (data.nome() != null) {
            this.nome = data.nome();
        }
        if (data.dataNascimento() != null) {
            this.dataNascimento = data.dataNascimento();
        }
        if (data.cpf() != null) {
            this.cpf = data.cpf();
        }
        if (data.cep() != 0) {
            this.cep = data.cep();
        }
    }
}
