package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Telefone;
@Repository
public interface TelefoneRepository extends JpaRepository<Telefone,Integer>{

}
