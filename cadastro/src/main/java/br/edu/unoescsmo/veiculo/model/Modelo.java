package br.edu.unoescsmo.veiculo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_modelo")
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	@NotEmpty(message = "nome deve ser preenchido")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "marca")
	private Marca marca;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "versao")
	private Ano ano;


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


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public Ano getVersao() {
		return ano;
	}


	public void setVersao(Ano ano) {
		this.ano = ano;
	}


}
