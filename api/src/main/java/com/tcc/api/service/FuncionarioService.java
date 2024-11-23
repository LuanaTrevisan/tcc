package com.tcc.api.service;

import com.tcc.api.domain.funcionario.Funcionario;
import com.tcc.api.domain.funcionario.FuncionarioRequestDTO;
import com.tcc.api.domain.funcionario.FuncionarioResponseDTO;
import com.tcc.api.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario createFuncionario(FuncionarioRequestDTO data){

        Funcionario newFuncionario = new Funcionario();
        newFuncionario.setNome(data.nome());
        newFuncionario.setCpf(data.cpf());
        newFuncionario.setCargo(data.cargo());
        newFuncionario.setDataAdmissao(new Date(data.dataAdmissao()));

        funcionarioRepository.save(newFuncionario);

        return newFuncionario;
    }
    public List<FuncionarioResponseDTO> getFuncionario(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<Funcionario> funcionarioPage = this.funcionarioRepository.findAll(pageable);
        return funcionarioPage.map(funcionario -> new FuncionarioResponseDTO(funcionario.getId(), funcionario.getNome(), funcionario.getCpf(), funcionario.getCargo(), funcionario.getDataAdmissao()))
                .stream().toList();
    }
}
