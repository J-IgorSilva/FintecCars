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
}
