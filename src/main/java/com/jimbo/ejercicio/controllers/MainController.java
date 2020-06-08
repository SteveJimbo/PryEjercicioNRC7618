package com.jimbo.ejercicio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class MainController {
	
	@GetMapping(value= {"/","/index.html"})
	public String index(Model model) {
		//El retorno indica el nombre de la vista 
		//se coloca unicamemente el nombre sin la extension
		return "index";
	}
	
	@GetMapping(value="/portfolio.html")
	public String portfolio(Model model) {
		return "portfolio";
	}
	
	@GetMapping(value="/about.html")
	public String about(Model model) {
		return "about";
	}
}
