package com.senacead.cuboMagico.controller;

import com.senacead.cuboMagico.model.Usuario;
import com.senacead.cuboMagico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CuboController {   
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/pagina-principal")
    public String mostrarPagPrincipal(Model model) {
        model.addAttribute("usuario", new Usuario());
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
    
    @PostMapping("/registrar")
    public String recebeCadastro(@ModelAttribute Usuario usuario) {       
        usuarioService.criar(usuario);
        return "redirect:/pagina-principal";
    }
}
