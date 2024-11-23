package com.tcc.api.service;

import com.tcc.api.domain.funcionario.*;
import com.tcc.api.domain.registroPonto.RegistroPonto;
import com.tcc.api.domain.registroPonto.RegistroPontoRequestDTO;
import com.tcc.api.domain.registroPonto.RegistroPontoResponseDTO;
import com.tcc.api.repositories.FuncionarioRepository;
import com.tcc.api.repositories.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;
import java.util.UUID;

@Service
public class RegistroPontoService {

        @Autowired
        private RegistroPontoRepository registroPontoRepository ;

        @Autowired
        private FuncionarioRepository funcionarioRepository ;

        public RegistroPonto addRegistroPontoToFuncionario(Integer funcionarioId, RegistroPontoRequestDTO
        RegistroPontoData){
            Funcionario funcionario = funcionarioRepository.findById(funcionarioId)
                    .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));

            RegistroPonto registroPonto = new RegistroPonto();
            registroPonto.setFuncionario(new Funcionario());
            registroPonto.setData(new Date(RegistroPontoData.data()));
            registroPonto.setHoraEntrada(RegistroPontoData.horaEntrada());
            registroPonto.setHoraSaida(RegistroPontoData.horaSaida());
            registroPonto.setHoraSaida(RegistroPontoData.horasTrabalhadas());
            registroPonto.setObservacao(RegistroPontoData.observacao());

            registroPontoRepository.save(registroPonto);

            return registroPonto;
    }
    public List<RegistroPontoResponseDTO> getRegistroPonto(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<RegistroPonto> registroPontoPage = this.registroPontoRepository.findAll(pageable);
        return registroPontoPage.map(registroPonto -> new RegistroPontoResponseDTO(registroPonto.getId(), registroPonto.getFuncionario(), registroPonto.getData(), registroPonto.getHoraEntrada(), registroPonto.getHoraSaida(), registroPonto.getHorasTrabalhadas(), registroPonto.getObservacao()))
                .stream().toList();
    }
}
