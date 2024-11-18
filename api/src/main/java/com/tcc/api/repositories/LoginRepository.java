package com.tcc.api.repositories;

import com.tcc.api.domain.funcionario.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LoginRepository extends JpaRepository<Login, UUID> {
}