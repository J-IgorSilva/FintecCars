package com.finteccars.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "locacao")
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao", nullable = false)
    private Integer idLocacao;

    @Column(name = "data_locacao", nullable = false)
    private Date dataLocacao;

    @Column(name = "data_devolucao", nullable = false)
    private Date dataDevolucao;

    @Column(name = "valor_locacao", nullable = false)
    private Float valorLocacao;

    @Column(name = "numero_cartao", nullable = false, length = 16)
    private String numeroCartao;

    @Column(name = "cvv_cartao", nullable = false,length = 3)
    private String cvvCartao;

    @Column(name = "vencimento_cartao", nullable = false)
    private Date vencimentoCartao;

    @Column(name = "nome_titular_cartao", nullable = false,length = 90)
    private String nomeTitularCartao;

    @Column(name = "cpf_titular_cartao", nullable = false,length = 12)
    private String cpfTitularCartao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_locacao", nullable = false)
    private TipoLocacao idTipoLocacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_forma_pagamento", nullable = false)
    private FormaPagamento idFormaPagemto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cartao", nullable = false)
    private Cartao idCartao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modelo", nullable = false)
    private Modelo idModelo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa idPessoa;

}
