package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.TipoCartao;
@Repository
public interface TipoCartaoRepository extends JpaRepository<TipoCartao,Integer>{

}
