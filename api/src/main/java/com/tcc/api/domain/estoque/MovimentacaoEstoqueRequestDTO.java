package com.tcc.api.domain.estoque;

public record MovimentacaoEstoqueRequestDTO(String produto, String tipoMovimentacao, int quantidade, long dataMovimentacao, String observacao) {
}
