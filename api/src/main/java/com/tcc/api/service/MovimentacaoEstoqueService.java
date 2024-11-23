package com.tcc.api.service;

import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoque;
import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoqueRequestDTO;
import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoqueResponseDTO;
import com.tcc.api.domain.produto.Produto;
import com.tcc.api.repositories.MovimentacaoEstoqueRepository;
import com.tcc.api.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MovimentacaoEstoqueService {

    @Autowired
    private MovimentacaoEstoqueRepository movimentacaoEstoqueRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public MovimentacaoEstoque addMovimentacaoEstoqueToProduto(Integer produtoId, MovimentacaoEstoqueRequestDTO MovimentacaoEstoqueData){
        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
        movimentacaoEstoque.setProduto(new  Produto());
        movimentacaoEstoque.setTipoMovimentacao(MovimentacaoEstoqueData.tipoMovimentacao());
        movimentacaoEstoque.setQuantidade(MovimentacaoEstoqueData.quantidade());
        movimentacaoEstoque.setDataMovimentacao(new Date(MovimentacaoEstoqueData.dataMovimentacao()));
        movimentacaoEstoque.setObservacao(MovimentacaoEstoqueData.observacao());

        movimentacaoEstoqueRepository.save(movimentacaoEstoque);

        return movimentacaoEstoque;
    }
    public List<MovimentacaoEstoqueResponseDTO> getMovimentacaoEstoque(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<MovimentacaoEstoque> movimentacaoEstoquePage = this.movimentacaoEstoqueRepository.findAll(pageable);
        return movimentacaoEstoquePage.map(movimentacaoEstoque -> new MovimentacaoEstoqueResponseDTO(movimentacaoEstoque.getId(), movimentacaoEstoque.getProduto(), movimentacaoEstoque.getTipoMovimentacao(),movimentacaoEstoque.getQuantidade(), movimentacaoEstoque.getDataMovimentacao(), movimentacaoEstoque.getObservacao()))
                .stream().toList();
    }
}
