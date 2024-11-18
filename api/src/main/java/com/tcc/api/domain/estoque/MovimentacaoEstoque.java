package com.tcc.api.domain.estoque;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "movimentacaoEstoque")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovimentacaoEstoque {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "produtoId")
    private Produto produto;
    private String tipoMovimentacao;
    private int quantidade;
    private Date dataMovimentacao;
    private String observacao;

}
