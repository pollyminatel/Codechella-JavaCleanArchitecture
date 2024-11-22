package br.com.alura.codechella.infra.controller;

import java.time.LocalDate;

public record UsuarioAlteradoDto(
        String cpf,
        String email
) {
}
