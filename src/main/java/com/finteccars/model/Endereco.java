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
 * Classe que representa um endereço.
 *
 * Essa classe é mapeada para a tabela "endereco" no banco de dados.
 */
@Entity
@Table(name = "endereco")
public class Endereco {
    /**
     * Identificador único do endereço.
     *
     * É gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco", nullable = false)
    private Integer idEndereco;
    /**
     * Nome do logradouro (rua, avenida, etc.).
     */
    @Column(name = "nome_logadouro", nullable = false, length = 150)
    private String nomeLogadouro;
    /**
     * Número do logradouro.
     */
    @Column(name = "numero_logadouro", nullable = false)
    private Integer numeroLogadouro;
    /**
     * CEP (Código de Endereçamento Postal).
     */
    @Column(name = "cep", nullable = false, length = 10)
    private String cep;
    /**
     * Bairro.
     */
    @Column(name = "bairro", nullable = false, length = 60)
    private String bairro;
    /**
     * Município (cidade).
     */
    @Column(name = "municipio", nullable = false, length = 60)
    private String municipio;
    /**
     * Unidade federativa (UF).
     */
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;
    /**
     * Pessoa a quem o endereço pertence.
     *
     * Relacionamento ManyToOne com a classe Pessoa.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa idpessoa;
    /**
     * Tipo do logradouro (rua, avenida, etc.).
     *
     * Relacionamento ManyToOne com a classe TipoLogadouro.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_logadouro", nullable = false)
    private TipoLogadouro idTipoLogadouro;

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNomeLogadouro() {
        return nomeLogadouro;
    }

    public void setNomeLogadouro(String nomeLogadouro) {
        this.nomeLogadouro = nomeLogadouro;
    }

    public Integer getNumeroLogadouro() {
        return numeroLogadouro;
    }

    public void setNumeroLogadouro(Integer numeroLogadouro) {
        this.numeroLogadouro = numeroLogadouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Pessoa getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Pessoa idpessoa) {
        this.idpessoa = idpessoa;
    }

    public TipoLogadouro getIdTipoLogadouro() {
        return idTipoLogadouro;
    }

    public void setIdTipoLogadouro(TipoLogadouro idTipoLogadouro) {
        this.idTipoLogadouro = idTipoLogadouro;
    }

    public Endereco(Integer idEndereco, String nomeLogadouro, Integer numeroLogadouro, String cep, String bairro,
            String municipio, String uf, Pessoa idpessoa, TipoLogadouro idTipoLogadouro) {
        this.idEndereco = idEndereco;
        this.nomeLogadouro = nomeLogadouro;
        this.numeroLogadouro = numeroLogadouro;
        this.cep = cep;
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
        this.idpessoa = idpessoa;
        this.idTipoLogadouro = idTipoLogadouro;
    }

    public Endereco(){}

}
