package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;

public class DeletarUsuario {

    private final RepositorioDeUsuario repositorioDeUsuario;

    public DeletarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public String deletarUsuario(String cpf) {
        return this.repositorioDeUsuario.deletarUsuario(cpf);
    }
}
