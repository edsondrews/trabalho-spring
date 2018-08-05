package br.edu.unoescsmo.veiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.veiculo.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	
}
