package com.tcc.api.domain.login;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "login")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Login {
    @Id
    @GeneratedValue
    @Column(name = "usuario")
    private String usuario;

    @Column(name = "senha")
    private String senha;

}
