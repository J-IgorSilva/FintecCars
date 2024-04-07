package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.TipoLocacao;
@Repository
public interface TipoLocacaoRepository extends JpaRepository<TipoLocacao,Integer>{

}
