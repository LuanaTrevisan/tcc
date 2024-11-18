package com.tcc.api.domain.funcionario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Table(name = "login")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Login {
    @Id
    @GeneratedValue
    private UUID id;
    private String cpf;
    private String senha;

}
