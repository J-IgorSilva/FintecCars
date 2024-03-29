package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipolocacao")
public class TipoLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_locacao", nullable = false)
    private Integer idTipoLocacao;

    @Column(name = "tipo_de_locacao", nullable = false, length = 50)
    private String tipoDeLocacao;

    public Integer getIdTipoLocacao() {
        return idTipoLocacao;
    }

    public void setIdTipoLocacao(Integer idTipoLocacao) {
        this.idTipoLocacao = idTipoLocacao;
    }

    public String getTipoDeLocacao() {
        return tipoDeLocacao;
    }

    public void setTipoDeLocacao(String tipoDeLocacao) {
        this.tipoDeLocacao = tipoDeLocacao;
    }

    public TipoLocacao(Integer idTipoLocacao, String tipoDeLocacao) {
        this.idTipoLocacao = idTipoLocacao;
        this.tipoDeLocacao = tipoDeLocacao;
    }

    public TipoLocacao(){}
}
