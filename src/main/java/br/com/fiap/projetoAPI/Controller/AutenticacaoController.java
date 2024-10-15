package br.com.fiap.projetoAPI.Controller;

import br.com.fiap.projetoAPI.Service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AutenticacaoController {
    @Autowired
    private final AutenticacaoService autenticacaoService;

    public AutenticacaoController(AutenticacaoService autenticacaoService) {
        this.autenticacaoService = autenticacaoService;
    }

    @PostMapping("autenticar")
    public String autenticar(Authentication authentication){
        return autenticacaoService.autenticar(authentication);
    }

}
