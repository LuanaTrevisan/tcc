package com.tcc.api.controller;

import com.tcc.api.domain.funcionario.Funcionario;
import com.tcc.api.domain.funcionario.FuncionarioResponseDTO;
import com.tcc.api.domain.funcionario.FuncionarioRequestDTO;
import com.tcc.api.repositories.FuncionarioRepository;
import com.tcc.api.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Funcionario> create (@RequestBody FuncionarioRequestDTO body){
        Funcionario newFuncionario = this.funcionarioService.createFuncionario(body);
        return ResponseEntity.ok(newFuncionario);
    }

    public ResponseEntity<List<FuncionarioResponseDTO>> getLogin(){

    }
}
