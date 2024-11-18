package com.tcc.api.service;

import com.tcc.api.domain.funcionario.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistroPontoService {
    public RegistroPonto createRegistroPonto(RegistroPontoResquestDTO data){

        RegistroPonto newRegistroPonto = new RegistroPonto();
        newRegistroPonto.setFuncionario(new Funcionario());
        newRegistroPonto.setData(new Date(data.data()));
        newRegistroPonto.setHoraEntrada(data.horaEntrada());
        newRegistroPonto.setHoraSaida(data.horaSaida());
        newRegistroPonto.setObservacao(data.observacao());

        return newRegistroPonto;
    }
}
