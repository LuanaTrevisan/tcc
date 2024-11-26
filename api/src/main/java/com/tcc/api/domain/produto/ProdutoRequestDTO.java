package com.tcc.api.domain.produto;

public record ProdutoRequestDTO(String nome, String descricao, Integer quantidade, float preco_unitario) {
}
