package com.finteccars.infra.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import com.finteccars.model.Usuario;
import com.finteccars.repository.UsuarioRepository;

@Component
public class CustomCustomDetailsServices implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioRepository.findByEmail(username);
        new UsernameNotFoundException("das");
        return new org.springframework.security.core.userdetails.User(usuario.getEmail(), usuario.getSenha(),
                new ArrayList<>());
    }
}
