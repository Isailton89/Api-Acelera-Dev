package dev.acelera.api.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date dataAniversario;
    private int cpf;
    private int cep;

    public User(UserRegistrationData data) {
        this.nome = data.nome();
        this.dataAniversario = data.dataAniversario();
        this.cpf = data.cpf();
        this.cep = data.cep();
    }
}
