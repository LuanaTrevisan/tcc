package com.tcc.api.domain.registroPonto;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

public record RegistroPontoResponseDTO(UUID Id, com.tcc.api.domain.funcionario.Funcionario funcionario, Date data, LocalTime horaEntrada, LocalTime horaSaida, LocalTime horasTrabalhadas, String observacao) {
}
