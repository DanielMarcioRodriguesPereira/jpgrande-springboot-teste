package com.dmrp.jpgrande.springboot.test.modelo.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dmrp.jpgrande.springboot.test.modelo.entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    List<Usuario> findByEmail(String email);

    Usuario findById(long id);
}
