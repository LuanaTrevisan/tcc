package com.tcc.api.domain.funcionario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Table(name = "funcionario")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Funcionario {

    @Id
    @GeneratedValue

    private UUID id;
    private String nome;
    private String cpf;
    private String cargo;
    private Date dataAdmissao;
    private boolean status;

}
