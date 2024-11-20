package com.tcc.api.controller;

import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoque;
import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoqueRequestDTO;
import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoqueResponseDTO;
import com.tcc.api.service.MovimentacaoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/movimentacaoEstoque")
public class MovimentacaoEstoqueController {

    @Autowired
    private MovimentacaoEstoqueService movimentacaoEstoqueService;

    @PostMapping("/produto/{produtoId}")
    public ResponseEntity<MovimentacaoEstoque> addMovimentacaoEstoqueToProduto(@PathVariable UUID produtoId, @RequestBody MovimentacaoEstoqueRequestDTO data){
        MovimentacaoEstoque movimentacaoEstoque = this.movimentacaoEstoqueService.addMovimentacaoEstoqueToProduto(produtoId, data);
        return ResponseEntity.ok(movimentacaoEstoque);
    }

    public ResponseEntity<List<MovimentacaoEstoqueResponseDTO>> getLogin(){

    }
}
