package com.tcc.api.domain.funcionario;

public record FuncionarioRequestDTO(String nome, String cpf, String cargo, long dataAdmissao) {
}
