package com.tcc.api.service;

import com.tcc.api.domain.produto.Produto;
import com.tcc.api.domain.produto.ProdutoRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    public Produto createProduto(ProdutoRequestDTO data){

        Produto newProduto = new Produto();
        newProduto.setNome(data.nome());
        newProduto.setDescricao(data.descricao());
        newProduto.setQuantidade(data.quantidade());
        newProduto.setPrecoUnitario(data.precoUnitario());

        return newProduto;

    }

}
