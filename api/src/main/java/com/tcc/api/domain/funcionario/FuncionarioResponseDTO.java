package com.tcc.api.domain.funcionario;

import java.util.Date;

public record FuncionarioResponseDTO(Integer Id, String nome, String cpf, String cargo, Date data_admissao) {
}
