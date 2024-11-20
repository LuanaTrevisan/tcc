package com.tcc.api.domain.movimentacaoEstoque;

public record MovimentacaoEstoqueRequestDTO(String produto, String tipoMovimentacao, int quantidade, long dataMovimentacao, String observacao) {
}
