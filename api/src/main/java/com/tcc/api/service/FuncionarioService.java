package com.tcc.api.service;

import com.tcc.api.domain.funcionario.Funcionario;
import com.tcc.api.domain.funcionario.FuncionarioResquestDTO;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FuncionarioService {
    public Funcionario createFuncionario(FuncionarioResquestDTO data){

        Funcionario newFuncionario = new Funcionario();
        newFuncionario.setNome(data.nome());
        newFuncionario.setCpf(data.cpf());
        newFuncionario.setCargo(data.cargo());
        newFuncionario.setDataAdmissao(new Date(data.dataAdmissao()));
        newFuncionario.setStatus(data.status());

        return newFuncionario;
    }
}
