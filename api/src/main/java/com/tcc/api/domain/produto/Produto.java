package com.tcc.api.domain.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado para mapeamento de SERIAL
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "precounitario")
    private float precoUnitario;

}
