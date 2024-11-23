package com.tcc.api.domain.funcionario;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado para mapeamento de SERIAL
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "dataadmissao")
    private Date dataAdmissao;

}
