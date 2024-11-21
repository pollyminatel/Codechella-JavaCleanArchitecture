package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class AlteraUsuario {
    private final RepositorioDeUsuario repositorio;

    public AlteraUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario alteraDadosUsuario(Usuario usuario) {
        return repositorio.alteraUsuario(usuario.getCpf(), usuario.getEmail());
    }
}
