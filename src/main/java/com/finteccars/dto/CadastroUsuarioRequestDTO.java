package com.finteccars.dto;

import java.util.Date;

public record CadastroUsuarioRequestDTO(String nome, String email, String senha, Date ultimaAtualizacao) {
}
