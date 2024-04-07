package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Marca;
@Repository
public interface MarcaRepository extends JpaRepository<Marca,Integer>{

}
