package com.tcc.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.omnira.repository")

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite acesso a todas as rotas
                .allowedOrigins("http://localhost:8080") // Permite requisições do frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}



