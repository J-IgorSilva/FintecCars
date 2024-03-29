package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipocartao")
public class TipoCartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cartao", nullable = false)
    private Integer idTipoCartao;

    @Column(name = "tipo_cartao", nullable = false, length = 50)
    private String tipoCartao;
}
