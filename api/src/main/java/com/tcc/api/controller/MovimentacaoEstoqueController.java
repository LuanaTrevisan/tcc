package com.tcc.api.controller;

import com.tcc.api.domain.estoque.MovimentacaoEstoque;
import com.tcc.api.domain.estoque.MovimentacaoEstoqueRequestDTO;
import com.tcc.api.repositories.MovimentacaoEstoqueRepository;
import com.tcc.api.service.MovimentacaoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movimentacaoEstoque")
public class MovimentacaoEstoqueController {
    @Autowired
    private MovimentacaoEstoqueRepository movimentacaoEstoqueRepository;

    @Autowired
    private MovimentacaoEstoqueService movimentacaoEstoqueService;

    @PostMapping
    public ResponseEntity<MovimentacaoEstoque> create (@RequestBody MovimentacaoEstoqueRequestDTO body){
        MovimentacaoEstoque newMovimentacaoEstoque = this.movimentacaoEstoqueService.createMovimentacaoEstoque(body);
        return ResponseEntity.ok(newMovimentacaoEstoque);
    }
}
