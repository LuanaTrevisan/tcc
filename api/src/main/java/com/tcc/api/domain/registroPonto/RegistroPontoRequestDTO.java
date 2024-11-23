package com.tcc.api.domain.registroPonto;

import java.time.LocalTime;

public record RegistroPontoRequestDTO(String funcionario, long data, LocalTime horaEntrada, LocalTime horaSaida, LocalTime horasTrabalhadas,String observacao) {
}
