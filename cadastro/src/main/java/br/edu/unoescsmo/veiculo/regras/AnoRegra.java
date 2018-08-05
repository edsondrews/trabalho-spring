package br.edu.unoescsmo.veiculo.regras;

import java.util.List;

import br.edu.unoescsmo.veiculo.model.Ano;

public interface AnoRegra {

	void salvar(Ano modelo);


	List<Ano> listar();
	
	List<Ano> dadosGrid();

}
