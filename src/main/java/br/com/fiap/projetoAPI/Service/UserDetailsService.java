package br.com.fiap.projetoAPI.Service;

import br.com.fiap.projetoAPI.Model.Usuario;
import br.com.fiap.projetoAPI.Repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    public UserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByUsername(username)
                .map(UserAutenticacacoService::new)
                .orElseThrow(()-> new UsernameNotFoundException("User not found!!!"));
    }
}
