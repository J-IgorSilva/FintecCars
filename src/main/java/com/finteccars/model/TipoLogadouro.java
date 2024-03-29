package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipologadouro")
public class TipoLogadouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_logadouro", nullable = false)
    private Integer idTipoLogadouro;

    @Column(name = "tipo_de_logadouro", nullable = false, length = 80)
    private String descricaoLogadouro;

}
