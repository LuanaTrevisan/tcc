package com.tcc.api.service;

import com.tcc.api.domain.funcionario.*;
import com.tcc.api.repositories.FuncionarioRepository;
import com.tcc.api.repositories.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class RegistroPontoService {

        @Autowired
        private RegistroPontoRepository registroPontoRepository ;

        @Autowired
        private FuncionarioRepository funcionarioRepository ;

        public RegistroPonto addRegistroPontoToFuncionario(UUID funcionarioId, RegistroPontoResquestDTO
        RegistroPontoData){
            Funcionario funcionario = funcionarioRepository.findById(funcionarioId)
                    .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));

            RegistroPonto registroPonto = new RegistroPonto();
            registroPonto.setFuncionario(new Funcionario());
            registroPonto.setData(new Date(RegistroPontoData.data()));
            registroPonto.setHoraEntrada(RegistroPontoData.horaEntrada());
            registroPonto.setHoraSaida(RegistroPontoData.horaSaida());
            registroPonto.setObservacao(RegistroPontoData.observacao());

            return registroPontoRepository.save(registroPonto);
    }
}
