package com.senacead.cuboMagico.controller;

import com.senacead.cuboMagico.model.Usuario;
import com.senacead.cuboMagico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        var novoUsuario = usuarioService.criar(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }
}
