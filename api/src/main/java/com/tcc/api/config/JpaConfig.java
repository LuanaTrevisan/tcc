package com.tcc.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.tcc.api.repositories")
@EntityScan(basePackages = "com.tcc.api.domain")
@EnableTransactionManagement
public class JpaConfig {
    // Configuração adicional se necessário
}
