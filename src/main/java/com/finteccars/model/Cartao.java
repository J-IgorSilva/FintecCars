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

/**
 * Classe que representa um cartão.
 * 
 * Essa classe é mapeada para a tabela "cartao" no banco de dados.
 */
@Entity
@Table(name = "cartao")
public class Cartao {
    /**
     * Identificador único do cartão.
     * 
     * É gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao", nullable = false)
    private Integer idCartao;
    /**
     * Bandeira do cartão.
     * 
     * Exemplos: "Visa", "Mastercard", "Elo".
     */
    @Column(name = "bandeira", nullable = false, length = 50)
    private String bandeira;
    /**
     * Tipo do cartão.
     * 
     * Relacionamento ManyToOne com a classe TipoCartao.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_cartao", nullable = false)
    private TipoCartao idTipoCartao;

    /**
     * Retorna o identificador único do cartão.
     * 
     * @return O identificador único do cartão.
     */
    public Integer getIdCartao() {
        return idCartao;
    }

    /**
     * Define o identificador único do cartão.
     * 
     * @param idCartao O identificador único do cartão.
     */
    public void setIdCartao(Integer idCartao) {
        this.idCartao = idCartao;
    }

    /**
     * Retorna a bandeira do cartão.
     * 
     * @return A bandeira do cartão.
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * Define a bandeira do cartão.
     * 
     * @param bandeira A bandeira do cartão.
     */
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * Retorna o tipo do cartão.
     * 
     * @return O tipo do cartão (relacionamento com a classe TipoCartao).
     */
    public TipoCartao getIdTipoCartao() {
        return idTipoCartao;
    }

    /**
     * Define o tipo do cartão.
     * 
     * @param idTipoCartao O tipo do cartão (relacionamento com a classe
     *                     TipoCartao).
     */
    public void setIdTipoCartao(TipoCartao idTipoCartao) {
        this.idTipoCartao = idTipoCartao;
    }

    /**
     * Construtor vazio da classe Cartao.
     */
    public Cartao() {
    }

    /**
     * Construtor da classe Cartao.
     * 
     * @param idCartao     Identificador único do cartão.
     * @param bandeira     Bandeira do cartão.
     * @param idTipoCartao Tipo do cartão (relacionamento com a classe TipoCartao).
     */
    public Cartao(Integer idCartao, String bandeira, TipoCartao idTipoCartao) {
        this.idCartao = idCartao;
        this.bandeira = bandeira;
        this.idTipoCartao = idTipoCartao;
    }

}
