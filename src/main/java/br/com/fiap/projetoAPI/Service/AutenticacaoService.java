package br.com.fiap.projetoAPI.Service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {
    private JWTService jwtService;

    public AutenticacaoService(JWTService jwtService){
        this.jwtService = jwtService;
    }

    public String autenticar(Authentication authentication){
        return jwtService.generateToken(authentication);
    }
}
