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

import br.edu.unoescsmo.veiculo.model.Modelo;
import br.edu.unoescsmo.veiculo.regras.ModeloRegra;
import br.edu.unoescsmo.veiculo.repository.MarcaRepository;
import br.edu.unoescsmo.veiculo.repository.ModeloRepository;
import br.edu.unoescsmo.veiculo.repository.AnoRepository;

@Controller
@RequestMapping("/modelo")
public class ModeloController {

	@Autowired
	private ModeloRegra modeloRegra;

	@Autowired
	private ModeloRepository modeloRepository;
	
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	

	@Autowired
	private AnoRepository anoRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Modelo modelo, BindingResult erros) {
		if (erros.hasErrors()) {
			return "modelo/novo";

		}
		modeloRegra.salvar(modelo);
		return "redirect:/modelo/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("modelos", modeloRegra.dadosGrid());
		return "modelo/lista"; 
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("marcas", marcaRepository.findAll());
		model.addAttribute("versaos", anoRepository.findAll());

		return "modelo/novo";
	}
	
	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("modelo", modeloRepository.findById(codigo).get());
		model.addAttribute("marcas", marcaRepository.findAll());
		model.addAttribute("versaos", anoRepository.findAll());
		return "modelo/visualizar";
	}


	@PostMapping("/alterar")
	public String alterar(@Valid Modelo modelo, BindingResult erros) {
		if (erros.hasErrors()) {
			return "modelo/visualizar";

		}
		modeloRegra.salvar(modelo);
		return "redirect:/modelo/listar";
	}
	
	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		modeloRepository.deleteById(codigo);
		return "redirect:/modelo/listar";
	}
}
