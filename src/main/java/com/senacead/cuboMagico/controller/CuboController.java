package com.senacead.cuboMagico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuboController {
    @GetMapping("/pagina-principal")
    public String mostrarPagPrincipal() {
        return "index";
    }
}
