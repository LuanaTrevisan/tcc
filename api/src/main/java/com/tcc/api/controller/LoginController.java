package com.tcc.api.controller;

import com.tcc.api.domain.funcionario.Login;
import com.tcc.api.domain.funcionario.LoginRequestDTO;
import com.tcc.api.repositories.LoginRepository;
import com.tcc.api.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<Login> create (@RequestBody LoginRequestDTO body){
        Login newLogin = this.loginService.createLogin(body);
        return ResponseEntity.ok(newLogin);
    }

}
