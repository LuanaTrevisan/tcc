package com.tcc.api.repositories;

import com.tcc.api.domain.funcionario.RegistroPonto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, UUID> {

}
