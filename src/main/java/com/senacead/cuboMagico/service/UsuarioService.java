package com.senacead.cuboMagico.service;

import com.senacead.cuboMagico.model.Usuario;
import com.senacead.cuboMagico.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Usuario criar(Usuario usuario) {
        usuario.setId(null);
        usuarioRepository.save(usuario);
        return usuario;
    }
}
