package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "imagem")
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagem", nullable = false)
    private Integer idImagem;

    @Column(name = "tamanho_imagem", nullable = false)
    private Float tamanhoDaImagem;

    public Integer getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(Integer idImagem) {
        this.idImagem = idImagem;
    }

    public Float getTamanhoDaImagem() {
        return tamanhoDaImagem;
    }

    public void setTamanhoDaImagem(Float tamanhoDaImagem) {
        this.tamanhoDaImagem = tamanhoDaImagem;
    }

    public Imagem(Integer idImagem, Float tamanhoDaImagem) {
        this.idImagem = idImagem;
        this.tamanhoDaImagem = tamanhoDaImagem;
    }

    public Imagem(){}
}
