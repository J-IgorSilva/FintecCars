package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.TipoTelefone;
@Repository
public interface TipoTelefoneRepository extends JpaRepository<TipoTelefone,Integer>{

}
