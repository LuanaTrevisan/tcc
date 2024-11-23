package com.tcc.api.controller;

import com.tcc.api.domain.registroPonto.RegistroPonto;
import com.tcc.api.domain.registroPonto.RegistroPontoResponseDTO;
import com.tcc.api.domain.registroPonto.RegistroPontoRequestDTO;
import com.tcc.api.repositories.RegistroPontoRepository;
import com.tcc.api.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/registro_ponto")
public class RegistroPontoController {

    @Autowired
    private RegistroPontoRepository produtoRepository;

    @Autowired
    private RegistroPontoService registroPontoService;

    @PostMapping("/funcionario/{funcionarioId}")
    public ResponseEntity<RegistroPonto> addRegistroPontoToFuncionario(@PathVariable Integer funcionarioId, @RequestBody RegistroPontoRequestDTO data){
            RegistroPonto registroPonto = this.registroPontoService.addRegistroPontoToFuncionario(funcionarioId, data);
            return ResponseEntity.ok(registroPonto);
    }

    @GetMapping
    public ResponseEntity<List<RegistroPontoResponseDTO>> getRegistroPonto(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        List<RegistroPontoResponseDTO> allRegistroPonto = this.registroPontoService.getRegistroPonto(page,size);
        return ResponseEntity.ok(allRegistroPonto);
    }
}
