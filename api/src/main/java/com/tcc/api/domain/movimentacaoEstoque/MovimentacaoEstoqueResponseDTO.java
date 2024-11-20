package com.tcc.api.domain.movimentacaoEstoque;

import java.util.Date;
import java.util.UUID;

public record MovimentacaoEstoqueResponseDTO(UUID Id, String produto, String tipoMovimentacao, int quantidade, Date dataMovimentacao, String observacao) {
}
