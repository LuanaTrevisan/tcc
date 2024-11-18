package com.tcc.api.domain.funcionario;

import java.time.LocalTime;

public record RegistroPontoResquestDTO(String funcionario, long data, LocalTime horaEntrada, LocalTime horaSaida, String observacao) {
}
