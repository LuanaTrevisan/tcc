package com.tcc.api.controller;

import com.tcc.api.domain.funcionario.Funcionario;
import com.tcc.api.domain.funcionario.FuncionarioResponseDTO;
import com.tcc.api.domain.funcionario.FuncionarioRequestDTO;
import com.tcc.api.repositories.FuncionarioRepository;
import com.tcc.api.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody FuncionarioRequestDTO body){
        Funcionario newFuncionario = this.funcionarioService.createFuncionario(body);
        return ResponseEntity.ok(newFuncionario);
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> getFuncionario(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        List<FuncionarioResponseDTO> allFuncionario = this.funcionarioService.getFuncionario(page,size);
        return ResponseEntity.ok(allFuncionario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.funcionarioService.deleteFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}
