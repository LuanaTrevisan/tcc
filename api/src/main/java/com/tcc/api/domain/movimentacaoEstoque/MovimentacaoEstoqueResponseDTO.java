package com.tcc.api.domain.movimentacaoEstoque;

import java.util.Date;

public record MovimentacaoEstoqueResponseDTO(Integer Id, com.tcc.api.domain.produto.Produto produto, String tipoMovimentacao, int quantidade, Date dataMovimentacao, String observacao) {
}
