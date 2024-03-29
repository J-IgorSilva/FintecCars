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

    public Integer getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(Integer idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvvCartao() {
        return cvvCartao;
    }

    public void setCvvCartao(String cvvCartao) {
        this.cvvCartao = cvvCartao;
    }

    public Date getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(Date vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public String getNomeTitularCartao() {
        return nomeTitularCartao;
    }

    public void setNomeTitularCartao(String nomeTitularCartao) {
        this.nomeTitularCartao = nomeTitularCartao;
    }

    public String getCpfTitularCartao() {
        return cpfTitularCartao;
    }

    public void setCpfTitularCartao(String cpfTitularCartao) {
        this.cpfTitularCartao = cpfTitularCartao;
    }

    public TipoLocacao getIdTipoLocacao() {
        return idTipoLocacao;
    }

    public void setIdTipoLocacao(TipoLocacao idTipoLocacao) {
        this.idTipoLocacao = idTipoLocacao;
    }

    public FormaPagamento getIdFormaPagemto() {
        return idFormaPagemto;
    }

    public void setIdFormaPagemto(FormaPagamento idFormaPagemto) {
        this.idFormaPagemto = idFormaPagemto;
    }

    public Cartao getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Cartao idCartao) {
        this.idCartao = idCartao;
    }

    public Modelo getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Modelo idModelo) {
        this.idModelo = idModelo;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Locacao(Integer idLocacao, Date dataLocacao, Date dataDevolucao, Float valorLocacao, String numeroCartao,
            String cvvCartao, Date vencimentoCartao, String nomeTitularCartao, String cpfTitularCartao,
            TipoLocacao idTipoLocacao, FormaPagamento idFormaPagemto, Cartao idCartao, Modelo idModelo,
            Pessoa idPessoa) {
        this.idLocacao = idLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.numeroCartao = numeroCartao;
        this.cvvCartao = cvvCartao;
        this.vencimentoCartao = vencimentoCartao;
        this.nomeTitularCartao = nomeTitularCartao;
        this.cpfTitularCartao = cpfTitularCartao;
        this.idTipoLocacao = idTipoLocacao;
        this.idFormaPagemto = idFormaPagemto;
        this.idCartao = idCartao;
        this.idModelo = idModelo;
        this.idPessoa = idPessoa;
    }

    public Locacao(){}

}
