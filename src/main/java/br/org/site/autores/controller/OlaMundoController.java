package br.org.site.autores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String execute() {
		return "adiciona-livro";
	}
	
	
	

}
