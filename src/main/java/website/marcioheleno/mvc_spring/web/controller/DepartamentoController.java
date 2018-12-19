package website.marcioheleno.mvc_spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @RequestMapping("/cadastrar")
    public String Cadastrar () {
        return "/departamento/cadastro";
    }

    @RequestMapping("/listar")
    public String Listar () {
        return "/departamento/lista";
    }

}
