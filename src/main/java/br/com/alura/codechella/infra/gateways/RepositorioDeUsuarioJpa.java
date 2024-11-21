package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper mapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        repositorio.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return null;
//        return repositorio.findAll();
    }

    @Override
    public Usuario alteraUsuario(String cpf, String email) {
        UsuarioEntity entity = repositorio.findByCpf(cpf);
        entity.setEmail(email);
        repositorio.save(entity);
        return mapper.toDomain(entity);
    }
}