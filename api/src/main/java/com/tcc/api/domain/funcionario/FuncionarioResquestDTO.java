package com.tcc.api.domain.funcionario;

public record FuncionarioResquestDTO(String nome, String cpf, String cargo, long dataAdmissao, boolean status) {
}
