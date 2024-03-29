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
}
