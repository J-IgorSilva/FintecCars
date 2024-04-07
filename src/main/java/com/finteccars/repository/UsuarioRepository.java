package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finteccars.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

    Usuario findByEmail(String login);

}
