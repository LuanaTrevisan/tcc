package com.tcc.api.repositories;

import com.tcc.api.domain.registroPonto.RegistroPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, UUID> {

}
