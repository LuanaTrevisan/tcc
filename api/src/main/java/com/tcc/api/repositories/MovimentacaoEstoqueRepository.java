package com.tcc.api.repositories;

import com.tcc.api.domain.movimentacaoEstoque.MovimentacaoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, UUID> {

}