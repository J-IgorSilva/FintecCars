package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipodocumento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_documento", nullable = false)
    private Integer idTipoDocumento;

    @Column(name = "tipo_de_documento",nullable = false,length = 50)
    private String tipoDeDocumento;

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public TipoDocumento(Integer idTipoDocumento, String tipoDeDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public TipoDocumento(){}
}
