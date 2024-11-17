package com.tcc.api.domain.estoque;

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

@Entity
@Table(name = "produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    @Id
    @GeneratedValue

    private UUID id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private float precoUnitario;

}
