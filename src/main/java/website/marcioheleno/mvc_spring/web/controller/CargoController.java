package website.marcioheleno.mvc_spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {


    @RequestMapping("/cadastrar")
    public String Cadastrar () {
        return "/cargo/cadastro";
    }

    @RequestMapping("/listar")
    public String Listar () {
        return "/cargo/lista";
    }
}
