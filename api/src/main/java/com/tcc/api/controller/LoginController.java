package com.tcc.api.controller;

import com.tcc.api.domain.login.Login;
import com.tcc.api.domain.login.LoginRequestDTO;
import com.tcc.api.domain.login.LoginResponseDTO;
import com.tcc.api.domain.registroPonto.RegistroPontoResponseDTO;
import com.tcc.api.repositories.LoginRepository;
import com.tcc.api.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<LoginResponseDTO>> getLogin(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        List<LoginResponseDTO> allLogin = this.loginService.getLogin(page,size);
        return ResponseEntity.ok(allLogin);
    }
}
