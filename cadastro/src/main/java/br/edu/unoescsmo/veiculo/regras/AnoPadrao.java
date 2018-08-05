package br.edu.unoescsmo.veiculo.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.veiculo.model.Ano;
import br.edu.unoescsmo.veiculo.repository.AnoRepository;

@Service
public class AnoPadrao implements AnoRegra {

	@Autowired
	private AnoRepository anoRepository;

	@Override
	public void salvar(Ano ano) {
		anoRepository.save(ano);
	}

	public List<Ano> listar() {
		return anoRepository.findAll();
	}

	@Override
	public List<Ano> dadosGrid() {
		return anoRepository.findAll();
	}
}
