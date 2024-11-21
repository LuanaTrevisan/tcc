package com.tcc.api.domain.movimentacaoEstoque;

import java.util.Date;
import java.util.UUID;

public record MovimentacaoEstoqueResponseDTO(UUID Id, com.tcc.api.domain.produto.Produto produto, String tipoMovimentacao, int quantidade, Date dataMovimentacao, String observacao) {
}
