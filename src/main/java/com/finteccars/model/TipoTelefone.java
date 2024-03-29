package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipotelefone")
public class TipoTelefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_telefone", nullable = false)
    private Integer idTipoTelefone;

    @Column(name = "decricao_tipo_telefone",nullable = false,length = 30)
    private String descricaoTipoTelefone;

    public Integer getIdTipoTelefone() {
        return idTipoTelefone;
    }

    public void setIdTipoTelefone(Integer idTipoTelefone) {
        this.idTipoTelefone = idTipoTelefone;
    }

    public String getDescricaoTipoTelefone() {
        return descricaoTipoTelefone;
    }

    public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
        this.descricaoTipoTelefone = descricaoTipoTelefone;
    }

    public TipoTelefone(Integer idTipoTelefone, String descricaoTipoTelefone) {
        this.idTipoTelefone = idTipoTelefone;
        this.descricaoTipoTelefone = descricaoTipoTelefone;
    }

    public TipoTelefone(){}
}
