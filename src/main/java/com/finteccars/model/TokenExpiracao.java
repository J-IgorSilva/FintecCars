
package com.finteccars.model;


import java.time.Instant;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "token_expiracao")
public class TokenExpiracao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_token_expiracao", nullable = false)
    private Integer idTokenExpiracao;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;
    
    @Column(name = "time_token", nullable = false)
    private Instant timeToken;

    public Integer getIdTokenExpiracao() {
        return idTokenExpiracao;
    }

    public void setIdTokenExpiracao(Integer idTokenExpiracao) {
        this.idTokenExpiracao = idTokenExpiracao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date date) {
        this.dataCriacao = date;
    }

    public TokenExpiracao(Integer idTokenExpiracao, Date dataCriacao,Instant timeToken) {
        this.idTokenExpiracao = idTokenExpiracao;
        this.dataCriacao = dataCriacao;
        this.timeToken=timeToken;
    }

    
    public Instant getTimeToken() {
        return timeToken;
    }
    
    public void setTimeToken(Instant timeToken) {
        this.timeToken = timeToken;
    }
    
    public TokenExpiracao() {
    }
}
