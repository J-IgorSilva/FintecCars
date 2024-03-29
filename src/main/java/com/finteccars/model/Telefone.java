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
@Table(name = "telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefone", nullable = false)
    private Integer idTelefone;

    @Column(name = "codigo_area", nullable = false, length = 3)
    private String codigoArea;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Tipo_Telefone", nullable = false)
    private TipoTelefone idTipoTelefone;

    public Integer getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Integer idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoTelefone getIdTipoTelefone() {
        return idTipoTelefone;
    }

    public void setIdTipoTelefone(TipoTelefone idTipoTelefone) {
        this.idTipoTelefone = idTipoTelefone;
    }

    public Telefone(Integer idTelefone, String codigoArea, Integer numero, TipoTelefone idTipoTelefone) {
        this.idTelefone = idTelefone;
        this.codigoArea = codigoArea;
        this.numero = numero;
        this.idTipoTelefone = idTipoTelefone;
    }

    public Telefone(){}
}
