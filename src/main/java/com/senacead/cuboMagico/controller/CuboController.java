package com.senacead.cuboMagico.controller;

import com.senacead.cuboMagico.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CuboController {   
    @GetMapping("/pagina-principal")
    public String mostrarPagPrincipal() {
        return "index";
    }
    
    @GetMapping("/movimentos")
    public String exibeMovimentos() {
        return "movimentos";
    }
    
    @GetMapping("/patterns")
    public String exibePatterns() {
        return "patterns";
    }
    @GetMapping("/pecas")
    public String exibePecasCubo() {
        return "pecasCubo";
    }
    
    @GetMapping("/metodo-basico")
    public String exibeMetodo() {
        return "metodoBasico";
    }
    
    @GetMapping("/suporte")
    public String enviaSuporte() {
        return "suporte";
    }
    
    @GetMapping("/curiosidades")
    public String exibeCuriosidades() {
        return "curiosidades";
    }
}
