package com.tcc.api.service;

import com.tcc.api.domain.produto.Produto;
import com.tcc.api.domain.produto.ProdutoRequestDTO;
import com.tcc.api.domain.produto.ProdutoResponseDTO;
import com.tcc.api.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto createProduto(ProdutoRequestDTO data){

        Produto newProduto = new Produto();
        newProduto.setNome(data.nome());
        newProduto.setDescricao(data.descricao());
        newProduto.setQuantidade(data.quantidade());
        newProduto.setPreco_unitario(data.preco_unitario());

        return produtoRepository.save(newProduto);
    }
    public List<ProdutoResponseDTO> getProduto(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<Produto> produtoPage = this.produtoRepository.findAll(pageable);
        return produtoPage.map(produto -> new ProdutoResponseDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getQuantidade(), produto.getPreco_unitario()))
                .stream().toList();
    }
    public void deleteProduto(Integer id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Produto com ID " + id + " não encontrado");
        }
    }
}