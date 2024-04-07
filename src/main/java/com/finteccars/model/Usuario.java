package com.finteccars.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "email", nullable = false, length = 130)
    private String email;

    @Column(name = "nome", nullable = false, length = 80)
    private String nome;

    @Column(name = "ultima_atualizacao", nullable = false)
    private Date ultmaAtualizacao;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa idpessoa;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_token_expiracao", nullable = false)
    private TokenExpiracao idtokenExpiracao;

    @PrePersist
    public void prePersist() {
        this.ultmaAtualizacao = new Date();
    }

    public TokenExpiracao getTokenExpiracao() {
        return idtokenExpiracao;
    }

    public void setTokenExpiracao(TokenExpiracao tokenExpiracao) {
        this.idtokenExpiracao = tokenExpiracao;
    }
    
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Pessoa idpessoa) {
        this.idpessoa = idpessoa;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUltmaAtualizacao() {
        return ultmaAtualizacao;
    }

    public void setUltmaAtualizacao(Date ultmaAtualizacao) {
        this.ultmaAtualizacao = ultmaAtualizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(TokenExpiracao idtokenExpiracao, Integer idUsuario, String nome, String email, Date ultmaAtualizacao, String senha, Pessoa idpessoa) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.ultmaAtualizacao = ultmaAtualizacao;
        this.senha = senha;
        this.idpessoa = idpessoa;
        this.nome = nome;
        this.idtokenExpiracao=idtokenExpiracao;
    }

    /*public Usuario(Integer idUsuario, String nome, String email, String senha, Pessoa idpessoa) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
        this.idpessoa = idpessoa;
        this.nome = nome;
    }*/

    public Usuario() {
    }

}
