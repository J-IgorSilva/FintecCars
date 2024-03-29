package com.finteccars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade que representa uma forma de pagamento.
 */
@Entity
@Table(name = "formapagamento")
public class FormaPagamento {
    /**
     * Identificador único da forma de pagamento.
     * Chave primária gerada automaticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pagamento", nullable = false)
    private Integer idFormaPagamento;
    /**
     * Descrição da forma de pagamento.
     * Tamanho máximo: 50 caracteres.
     */
    @Column(name = "forma_de_pagamento", nullable = false, length = 50)
    private String formaDePagamento;

    /**
     * Obtém o identificador único da forma de pagamento.
     *
     * @return O identificador da forma de pagamento.
     */
    public Integer getIdFormaPagamento() {
        return idFormaPagamento;
    }

    /**
     * Define o identificador único da forma de pagamento.
     *
     * @param idFormaPagamento O novo identificador da forma de pagamento.
     */
    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    /**
     * Obtém a descrição da forma de pagamento.
     *
     * @return A descrição da forma de pagamento.
     */
    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    /**
     * Define a descrição da forma de pagamento.
     *
     * @param formaDePagamento A nova descrição da forma de pagamento.
     */
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    /**
     * Construtor que recebe o identificador e a descrição da forma de pagamento.
     *
     * @param idFormaPagamento O identificador da forma de pagamento.
     * @param formaDePagamento A descrição da forma de pagamento.
     */
    public FormaPagamento(Integer idFormaPagamento, String formaDePagamento) {
        this.idFormaPagamento = idFormaPagamento;
        this.formaDePagamento = formaDePagamento;
    }

    /**
     * Construtor vazio.
     */
    public FormaPagamento() {
    }
}
