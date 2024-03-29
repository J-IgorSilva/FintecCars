package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataforma")
public class Plataforma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plataforma", nullable = false)
    private Integer idPlataforma;

    public Integer getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Integer idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Plataforma(Integer idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Plataforma(){}
    
}
