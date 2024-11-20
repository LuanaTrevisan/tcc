package com.tcc.api.domain.funcionario;

import java.util.Date;
import java.util.UUID;

public record FuncionarioResponseDTO(UUID Id, String nome, String cpf, String cargo, Date dataAdmissao, boolean status) {
}
