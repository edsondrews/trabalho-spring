package br.edu.unoescsmo.veiculo.regras;

import java.util.List;

import br.edu.unoescsmo.veiculo.model.Modelo;

public interface ModeloRegra {

	void salvar(Modelo modelo);


	List<Modelo> listar();
	
	List<Modelo> dadosGrid();

}
