package com.tcc.api.controller;

import com.tcc.api.domain.funcionario.RegistroPonto;
import com.tcc.api.domain.funcionario.RegistroPontoResquestDTO;
import com.tcc.api.repositories.RegistroPontoRepository;
import com.tcc.api.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/registroPonto")
public class RegistroPontoController {

    @Autowired
    private RegistroPontoRepository produtoRepository;

    @Autowired
    private RegistroPontoService registroPontoService;

    @PostMapping("/funcionario/{funcionarioId}")
    public ResponseEntity<RegistroPonto> addRegistroPontoToFuncionario(@PathVariable UUID funcionarioId, @RequestBody RegistroPontoResquestDTO data){
            RegistroPonto registroPonto = this.registroPontoService.addRegistroPontoToFuncionario(funcionarioId, data);
            return ResponseEntity.ok(registroPonto);
    }
}
