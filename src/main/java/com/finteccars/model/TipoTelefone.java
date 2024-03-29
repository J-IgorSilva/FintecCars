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
}
