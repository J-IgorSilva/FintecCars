package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer>{

}
