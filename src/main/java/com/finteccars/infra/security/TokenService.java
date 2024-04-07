package com.finteccars.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.finteccars.model.Usuario;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String chaveSecret;

    public String generateToken(Usuario usuario) {
        try {
            Instant timetoken = generateExpirationDate();
            Algorithm algoritoauth = Algorithm.HMAC256(chaveSecret);// variavel que recebe o algoritimo para encriptar
            String token = JWT.create().withIssuer("fintec-cars") // quem esta emitindo o token
                    .withSubject(usuario.getEmail())// salvar o email do usuario no token
                    .withExpiresAt(timetoken)// quando expira
                    .sign(algoritoauth);// altorigo que gera o token
            return token;

        } catch (JWTCreationException exception) {
            throw new RuntimeException("Falha na autenticação");
        }
    }

    public String validaToken(String token) {
        try {
            Algorithm algoritoauth = Algorithm.HMAC256(chaveSecret);// variavel que recebe o algoritimo para encriptar
            return JWT.require(algoritoauth)// verifica a variavel
                    .withIssuer("fintec-cars")
                    .build()// cria o objeto
                    .verify(token)// verifica
                    .getSubject();
        } catch (JWTVerificationException exeption) {
            return null;
        }
    }

    public Instant generateExpirationDate() {
        return LocalDateTime.now().plusMinutes(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
