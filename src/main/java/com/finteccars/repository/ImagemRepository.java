package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Imagem;
@Repository
public interface ImagemRepository extends JpaRepository<Imagem,Integer>{

}
