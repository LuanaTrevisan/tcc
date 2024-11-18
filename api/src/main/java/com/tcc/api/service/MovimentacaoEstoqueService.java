package com.tcc.api.service;

import com.tcc.api.domain.estoque.MovimentacaoEstoque;
import com.tcc.api.domain.estoque.MovimentacaoEstoqueRequestDTO;
import com.tcc.api.domain.estoque.Produto;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MovimentacaoEstoqueService {

    public MovimentacaoEstoque createMovimentacaoEstoque(MovimentacaoEstoqueRequestDTO data){

        MovimentacaoEstoque newMovimentacaoEstoque = new MovimentacaoEstoque();
        newMovimentacaoEstoque.setProduto(new  Produto());
        newMovimentacaoEstoque.setTipoMovimentacao(data.tipoMovimentacao());
        newMovimentacaoEstoque.setQuantidade(data.quantidade());
        newMovimentacaoEstoque.setDataMovimentacao(new Date(data.dataMovimentacao()));
        newMovimentacaoEstoque.setObservacao(data.observacao());

        return newMovimentacaoEstoque;
    }
}
