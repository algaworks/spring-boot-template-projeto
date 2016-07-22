package com.algaworks.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}
	
	@RequestMapping
	public String pesquisa() {
		return "/produto/PesquisaProdutos";
	}
	
}
