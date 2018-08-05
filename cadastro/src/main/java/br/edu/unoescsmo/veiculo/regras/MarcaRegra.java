package br.edu.unoescsmo.veiculo.regras;

import java.util.List;

import br.edu.unoescsmo.veiculo.model.Marca;

public interface MarcaRegra {

	void salvar(Marca modelo);


	List<Marca> listar();
	
	List<Marca> dadosGrid();
	
}
