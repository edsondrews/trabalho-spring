package br.edu.unoescsmo.veiculo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Ano {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ano")
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	@NotEmpty(message = "deve ser preenchido")
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
