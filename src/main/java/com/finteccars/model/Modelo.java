package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo", nullable = false)
    private Integer idModelo;

    @Column(name="nome_modelo",nullable = false,length = 60)
    private String nomeModelo;

    @Column(name="cor_modelo",nullable = false,length=50)
    private String corModelo;

    @Column(name="quantidae_portas",nullable = false)
    private Integer quantidadePortas;

    @Column(name="placa",nullable = false,length = 8)
    private String placa;

    @Column(name = "renavan",nullable = false)
    private Integer renavan;

    @Column(name="numero_chassi",nullable=false,length = 17)
    private String numeroChassi;

    @Column(name="nome_pais_orgigem",nullable = false,length = 50)
    private String nomePaisOrigen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca", nullable = false)
    private Marca idMarca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_plataforma", nullable = false)
    private Plataforma idPlataforma;
}
