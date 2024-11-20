package com.tcc.api.domain.produto;

import java.util.UUID;

public record ProdutoResponseDTO(UUID Id, String nome, String descricao, Integer quantidade, float precoUnitario) {
}
