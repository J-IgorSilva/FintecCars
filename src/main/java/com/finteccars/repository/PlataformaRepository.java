package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Plataforma;
@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma,Integer> {

}
