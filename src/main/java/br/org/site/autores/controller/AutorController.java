package br.org.site.autores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.org.site.autores.dao.AuthorDao;
import br.org.site.autores.modelo.Author;

@Controller
public class AutorController {
	
	@Autowired
    private AuthorDao authorDao;
	
	@RequestMapping("addAuthor")
	public String adiciona(Author author) {
		
		return "author/author";
		
	}
	
	@RequestMapping("menu")
	public String inicial() {
		
		return "index";
		
	}

//	@GetMapping(value="listAuthors")
//    public ModelAndView lista(){
//
//        ModelAndView modelAndView = new ModelAndView("author/author");
//
//        modelAndView.addObject("authors", authorDao.findAll(1));
//
//        return modelAndView;
//    }
	
	

}
