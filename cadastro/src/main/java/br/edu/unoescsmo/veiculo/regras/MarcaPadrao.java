package br.edu.unoescsmo.veiculo.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.veiculo.model.Marca;
import br.edu.unoescsmo.veiculo.repository.MarcaRepository;

@Service
public class MarcaPadrao implements MarcaRegra {

	@Autowired
	private MarcaRepository marcaRepository;

	@Override
	public void salvar(Marca marca) {
		marcaRepository.save(marca);
	}

	public List<Marca> listar() {
		return marcaRepository.findAll();
	}
	
	@Override
	public List<Marca> dadosGrid() {
		return marcaRepository.findAll();
	}

}
