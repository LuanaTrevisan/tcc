package com.tcc.api.domain.estoque;

public record ProdutoRequestDTO(String nome, String descricao, Integer quantidade, float precoUnitario) {
}
