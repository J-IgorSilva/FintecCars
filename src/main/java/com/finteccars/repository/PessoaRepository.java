package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finteccars.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}
