package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void shouldThrowException_naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("111", "nome", LocalDate.parse("1111-11-11"), "email@email.com")
        );

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("111111111-11", "nome", LocalDate.parse("1111-11-11"), "email@email.com")
        );
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("nome", "111.111.111-11", LocalDate.parse("1111-11-11"));

        Assertions.assertEquals("nome", usuario.getNome());

        usuario = fabrica.incluiEndereco("1111111", 11, "lalalala");

        Assertions.assertEquals(11, usuario.getEndereco().getNumero());
    }
}
