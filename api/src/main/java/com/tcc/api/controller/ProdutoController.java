package com.tcc.api.controller;

import com.tcc.api.domain.estoque.Produto;
import com.tcc.api.domain.estoque.ProdutoRequestDTO;
import com.tcc.api.repositories.ProdutoRepository;
import com.tcc.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> create (@RequestBody ProdutoRequestDTO body){
        Produto newProduto = this.produtoService.createProduto(body);
        return ResponseEntity.ok(newProduto);
    }

}
