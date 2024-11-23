package com.tcc.api.domain.movimentacaoEstoque;

import com.tcc.api.domain.produto.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "movimentacao_estoque")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado para mapeamento de SERIAL
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "produtoid")
    private Produto produto;

    @Column(name = "tipomovimentacao")
    private String tipoMovimentacao;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "datamovimentacao")
    private Date dataMovimentacao;

    @Column(name = "observacao")
    private String observacao;

}
