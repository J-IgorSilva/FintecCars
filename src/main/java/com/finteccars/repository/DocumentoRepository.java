package com.finteccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.Documento;
@Repository
public interface DocumentoRepository extends JpaRepository<Documento,Integer>{

}
