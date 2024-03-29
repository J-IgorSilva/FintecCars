package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca", nullable = false)
    private Integer idMarca;

    @Column(name = "nome_marca", nullable = false, length = 100)
    private String nomeMarca;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Marca(Integer idMarca, String nomeMarca) {
        this.idMarca = idMarca;
        this.nomeMarca = nomeMarca;
    }

    public Marca(){}
}
