package com.finteccars.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.finteccars.dto.CadastroUsuarioRequestDTO;
import com.finteccars.dto.LoginUsuarioRequestDTO;
import com.finteccars.dto.UsuarioLoginResponseDTO;
import com.finteccars.infra.security.TokenService;
import com.finteccars.model.Pessoa;
import com.finteccars.model.TokenExpiracao;
import com.finteccars.model.Usuario;
import com.finteccars.repository.PessoaRepository;
import com.finteccars.repository.TokenExpiracaoRepository;
import com.finteccars.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final PessoaRepository pessoaRepository;
    private final TokenExpiracaoRepository tokenRepository;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginUsuarioRequestDTO body) {
        Usuario usuario = this.usuarioRepository.findByEmail(body.email());
        if (passwordEncoder.matches(body.senha(), usuario.getSenha())) {
            String token = this.tokenService.generateToken(usuario);
            return ResponseEntity.ok(new UsuarioLoginResponseDTO(usuario.getNome(), token));
        }
        return ResponseEntity.badRequest().body(new UsuarioLoginResponseDTO("Senha incorreta", null));
    }
    // return ResponseEntity.badRequest().build();}

    @PostMapping("/cadastrar")
    public ResponseEntity cadastro(@RequestBody CadastroUsuarioRequestDTO body) {
        Usuario usuario = this.usuarioRepository.findByEmail(body.email());
        Pessoa pessoa = this.pessoaRepository.findByNomePessoa(body.nome());
        if (usuario == null && pessoa == null) {
            Usuario newUsuario = new Usuario();
            Pessoa newPessoa = new Pessoa();
            TokenExpiracao tokendata = new TokenExpiracao();
            newPessoa.setNomePessoa(body.nome());
            this.pessoaRepository.save(newPessoa);// aa
            newUsuario.setEmail(body.email());
            newUsuario.setNome(body.nome());
            newUsuario.setUltmaAtualizacao(body.ultimaAtualizacao());
            newUsuario.setIdpessoa(newPessoa);
            newUsuario.setTokenExpiracao(tokendata);
            tokendata.setDataCriacao(newUsuario.getUltmaAtualizacao());
            tokendata.setTimeToken(tokenService.generateExpirationDate());
            newUsuario.setSenha(passwordEncoder.encode(body.senha()));
            this.usuarioRepository.save(newUsuario);
            this.tokenRepository.save(tokendata);

            String token = this.tokenService.generateToken(newUsuario);
            return ResponseEntity.ok(new UsuarioLoginResponseDTO(newUsuario.getNome(), token));
        }
        return ResponseEntity.badRequest().build();
    }
}// mensagem de erro mais atrativa
