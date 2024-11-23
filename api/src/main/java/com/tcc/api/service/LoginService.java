package com.tcc.api.service;

import com.tcc.api.domain.login.Login;
import com.tcc.api.domain.login.LoginRequestDTO;
import com.tcc.api.domain.login.LoginResponseDTO;
import com.tcc.api.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Login createLogin(LoginRequestDTO data){

        Login newLogin = new Login();
        newLogin.setUsuario(data.usuario());
        newLogin.setSenha(data.senha());

        loginRepository.save(newLogin);

        return newLogin;
    }
    public List<LoginResponseDTO> getLogin(int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<Login> loginPage = this.loginRepository.findAll(pageable);
        return loginPage.map(login -> new LoginResponseDTO(login.getUsuario(), login.getSenha()))
                .stream().toList();
    }
}
