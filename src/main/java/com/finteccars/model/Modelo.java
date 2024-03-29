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

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getCorModelo() {
        return corModelo;
    }

    public void setCorModelo(String corModelo) {
        this.corModelo = corModelo;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getRenavan() {
        return renavan;
    }

    public void setRenavan(Integer renavan) {
        this.renavan = renavan;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getNomePaisOrigen() {
        return nomePaisOrigen;
    }

    public void setNomePaisOrigen(String nomePaisOrigen) {
        this.nomePaisOrigen = nomePaisOrigen;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    public Plataforma getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Plataforma idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Modelo(Integer idModelo, String nomeModelo, String corModelo, Integer quantidadePortas, String placa,
            Integer renavan, String numeroChassi, String nomePaisOrigen, Marca idMarca, Plataforma idPlataforma) {
        this.idModelo = idModelo;
        this.nomeModelo = nomeModelo;
        this.corModelo = corModelo;
        this.quantidadePortas = quantidadePortas;
        this.placa = placa;
        this.renavan = renavan;
        this.numeroChassi = numeroChassi;
        this.nomePaisOrigen = nomePaisOrigen;
        this.idMarca = idMarca;
        this.idPlataforma = idPlataforma;
    }

    public Modelo(){}
}
