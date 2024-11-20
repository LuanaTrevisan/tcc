package com.tcc.api.service;

import com.tcc.api.domain.login.Login;
import com.tcc.api.domain.login.LoginRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public Login createLogin(LoginRequestDTO data){

        Login newLogin = new Login();
        newLogin.setUsuario(data.usuario());
        newLogin.setSenha(data.senha());

        return newLogin;
    }
}
