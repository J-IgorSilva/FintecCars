package com.finteccars.repository;

import java.time.Instant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finteccars.model.TokenExpiracao;


@Repository
public interface TokenExpiracaoRepository extends JpaRepository<TokenExpiracao,Integer>{
 TokenExpiracao  findByTimeToken(Instant timeToken);
}
