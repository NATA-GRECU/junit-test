package com.generation.contato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contato
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "O DDD deve ser preenchido")
	private String ddd;
	
	@NotEmpty(message = "O Telefone deve ser preenchido")
	private String telefone;
	
	@NotEmpty(message = "O Nome deve ser preenchido")
	private String nome;

	public Contato() {
		super();
	}

	public Contato(String ddd, String telefone, String nome) {
		this.nome = nome;
		this.ddd = ddd;
		this.telefone = telefone;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
