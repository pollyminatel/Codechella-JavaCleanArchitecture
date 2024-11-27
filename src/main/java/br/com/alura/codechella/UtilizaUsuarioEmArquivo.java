package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioEmArquivo {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario("333.333.333-33", "nome 3", LocalDate.parse("1999-01-01"), "email@email.com"));
        repositorio.cadastrarUsuario(new Usuario("444.444.444-44", "nome 4", LocalDate.parse("1999-01-01"), "email@email.com"));
        repositorio.cadastrarUsuario(new Usuario("555.555.555-55", "nome 5", LocalDate.parse("1999-01-01"), "email@email.com"));
        repositorio.cadastrarUsuario(new Usuario("666.666.666-66", "nome 6", LocalDate.parse("1999-01-01"), "email@email.com"));

//        System.out.println(repositorio.listarTodos());
        repositorio.gravaEmArquivo("usuario.txt");
    }
}
