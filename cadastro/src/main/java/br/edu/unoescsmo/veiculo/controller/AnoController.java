package br.edu.unoescsmo.veiculo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.veiculo.model.Ano;
import br.edu.unoescsmo.veiculo.regras.AnoRegra;
import br.edu.unoescsmo.veiculo.repository.AnoRepository;

@Controller
@RequestMapping("/ano")
public class AnoController {

	@Autowired
	private AnoRegra anoRegra;

	@Autowired
	private AnoRepository anoRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Ano ano, BindingResult erros) {
		if (erros.hasErrors()) {
			return "ano/novo";

		}
		anoRegra.salvar(ano);
		return "redirect:/ano/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Ano ano, BindingResult erros) {
		if (erros.hasErrors()) {
			return "ano/visualizar";

		}
		anoRegra.salvar(ano);
		return "redirect:/ano/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("anos", anoRegra.dadosGrid());
		
		return "ano/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("anoss", anoRepository.findAll());
		return "ano/novo";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		return "ano/visualizar";
	}
}
