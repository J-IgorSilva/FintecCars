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

/**
 * Classe que representa um documento.
 *
 * Essa classe é mapeada para a tabela "documento" no banco de dados.
 */
@Entity
@Table(name = "documento")
public class Documento {
    /**
     * Identificador único do documento.
     *
     * É gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento", nullable = false)
    private Integer idDocumento;
    /**
     * Nome do documento.
     */
    @Column(name = "nome_documento", nullable = false, length = 50)
    private String nomeDocumento;
    /**
     * Data de expedição do documento.
     */
    @Column(name = "data_expedicao", nullable = false)
    private Date dataExpedicao;
    /**
     * Tipo do documento.
     *
     * Relacionamento ManyToOne com a classe TipoDocumento.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_documento", nullable = false)
    private TipoDocumento idTipoDocumento;
    /**
     * Pessoa a quem o documento pertence.
     *
     * Relacionamento ManyToOne com a classe Pessoa (representada aqui apenas pelo
     * ID).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa idPessoa;
    /**
     * Imagem do documento.
     *
     * Relacionamento ManyToOne com a classe `Imagem`.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_imagem", nullable = false)
    private Imagem idImagem;
    // Getters e Setters

    /**
     * Obtém o identificador do documento.
     *
     * @return Identificador do documento.
     */
    public Integer getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define o identificador do documento.
     *
     * @param idDocumento Identificador do documento.
     */
    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * Obtém o nome do documento.
     *
     * @return Nome do documento.
     */
    public String getNomeDocumento() {
        return nomeDocumento;
    }

    /**
     * Define o nome do documento.
     *
     * @param nomeDocumento Nome do documento.
     */
    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    /**
     * Obtém o Data do documento.
     *
     * @return data de Expediçaõ.
     */
    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    /**
     * Obtém o id do Tipo documento.
     *
     * @return id do Tipo documento.
     */
    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define o id do documento.
     *
     * @param idTipoDocumento id do tipo documento.
     */
    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    /**
     * Obtém o ID da pessoa.
     *
     * @return O ID da pessoa.
     */
    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    /**
     * Define o ID da pessoa.
     *
     * @param idPessoa O novo ID da pessoa.
     */
    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * Obtém o ID da imagem.
     *
     * @return O ID da imagem.
     */
    public Imagem getIdImagem() {
        return idImagem;
    }
    /**
     * Define o ID da imagem.
     *
     * @param idImagem O novo ID da imagem.
     */
    public void setIdImagem(Imagem idImagem) {
        this.idImagem = idImagem;
    }
    /**
     * Construtor com parâmetros.
     *
     * @param idDocumento     Identificador do documento.
     * @param nomeDocumento   Nome do documento.
     * @param dataExpedicao   Data de expedição do documento.
     * @param idTipoDocumento Tipo do documento.
     * @param idPessoa        Pessoa a quem o documento pertence.
     * @param idImagem        Imagem do documento.
     */
    public Documento(Integer idDocumento, String nomeDocumento, Date dataExpedicao, TipoDocumento idTipoDocumento,
            Pessoa idPessoa, Imagem idImagem) {
        this.idDocumento = idDocumento;
        this.nomeDocumento = nomeDocumento;
        this.dataExpedicao = dataExpedicao;
        this.idTipoDocumento = idTipoDocumento;
        this.idPessoa = idPessoa;
        this.idImagem = idImagem;
    }
    /**
     * Construtor sem parâmetros.
     */
    public Documento() {
    }

}
