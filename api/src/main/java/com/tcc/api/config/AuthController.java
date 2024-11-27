package com.tcc.api.config;

import com.tcc.api.domain.user.LoginRequestDTO;
import com.tcc.api.domain.user.ResponseDTO;
import com.tcc.api.domain.user.User;
import com.tcc.api.infra.security.TokenService;
import com.tcc.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<> login(@RequestBody LoginRequestDTO body){
        User user = this.userRepository.findByEmail(body.email()).orElseThrow(()-> new RuntimeException("User not found"));
        if (passwordEncoder.matches(user.getPassword(), body.password())){
            String token = this.tokenService.generateToken(user);
            return ResponseEntity.ok(new ResponseDTO(user.getName(), token));
        }
        return ResponseEntity.badRequest().build();
    }
    @PostMapping("/register")
    public ResponseEntity<> register(@RequestBody LoginRequestDTO body){
        User user = this.userRepository.findByEmail(body.email()).orElseThrow(()-> new RuntimeException("User not found"));
        if (passwordEncoder.matches(user.getPassword(), body.password())){
            String token = this.tokenService.generateToken(user);
            return ResponseEntity.ok(new ResponseDTO(user.getName(), token));
        }
        return ResponseEntity.badRequest().build();
    }
}
