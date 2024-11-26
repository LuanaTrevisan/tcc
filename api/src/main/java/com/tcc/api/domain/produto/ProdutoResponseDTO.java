package com.tcc.api.domain.produto;

import java.util.UUID;

public record ProdutoResponseDTO(Integer Id, String nome, String descricao, Integer quantidade, float preco_unitario) {
}
