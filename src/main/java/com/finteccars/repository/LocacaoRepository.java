package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Locacao;
@Repository
public interface LocacaoRepository extends JpaRepository<Locacao,Integer>{

}
