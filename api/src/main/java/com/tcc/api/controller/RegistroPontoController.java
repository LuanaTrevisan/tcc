package com.tcc.api.controller;

import com.tcc.api.domain.funcionario.RegistroPonto;
import com.tcc.api.domain.funcionario.RegistroPontoResquestDTO;
import com.tcc.api.repositories.RegistroPontoRepository;
import com.tcc.api.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registroPonto")
public class RegistroPontoController {

    @Autowired
    private RegistroPontoRepository produtoRepository;

    @Autowired
    private RegistroPontoService registroPontoService;

    @PostMapping
    public ResponseEntity<RegistroPonto> create (@RequestBody RegistroPontoResquestDTO body){
        RegistroPonto newRegistroPonto = this.registroPontoService.createRegistroPonto(body);
        return ResponseEntity.ok(new RegistroPonto());
    }
}
