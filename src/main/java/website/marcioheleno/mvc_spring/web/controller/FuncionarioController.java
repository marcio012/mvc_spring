package website.marcioheleno.mvc_spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @RequestMapping("/cadastrar")
    public String Cadastrar () {
        return "/funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String Listar () {
        return "/funcionario/lista";
    }

}
