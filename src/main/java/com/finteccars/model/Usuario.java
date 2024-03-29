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
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "email", nullable = false, length = 130)
    private String email;

    @Column(name = "ultima_atualizacao", nullable = false)
    private Date ultmaAtualizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa idpessoa;

    public Integer getIdUsuario() {
        return idUsuario;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Usuario(Integer idUsuario, String email, Date ultmaAtualizacao, Pessoa pessoa) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.ultmaAtualizacao = ultmaAtualizacao;
        this.pessoa = pessoa;
    }

    public Usuario() {
    }

    
}
