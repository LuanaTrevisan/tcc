package com.tcc.api.repositories;

import com.tcc.api.domain.funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}