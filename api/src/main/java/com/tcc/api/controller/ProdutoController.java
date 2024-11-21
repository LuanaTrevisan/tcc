package com.tcc.api.controller;

import com.tcc.api.domain.produto.Produto;
import com.tcc.api.domain.produto.ProdutoRequestDTO;
import com.tcc.api.domain.produto.ProdutoResponseDTO;
import com.tcc.api.repositories.ProdutoRepository;
import com.tcc.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> getProduto(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        List<ProdutoResponseDTO> allProduto = this.produtoService.getProduto(page,size);
        return ResponseEntity.ok(allProduto);
    }

}
