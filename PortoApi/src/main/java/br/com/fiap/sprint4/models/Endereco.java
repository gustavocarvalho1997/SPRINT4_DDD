package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Endereco {
	// Atributos
	private int id;
	private int numero;
	private String complemento;
	private String referencia;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	private Logradouro logradouro;
	
	// Construtores
	public Endereco(int id, int numero, String complemento, String referencia, LocalDate dataCadastro,
			Logradouro logradouro) {
		super();
		this.id = id;
		this.numero = numero;
		this.complemento = complemento;
		this.referencia = referencia;
		this.dataCadastro = dataCadastro;
		this.logradouro = logradouro;
	}
	public Endereco() {
		super();
	}
	
	public Endereco(int id, int numero, LocalDate dataCadastro, Logradouro logradouro) {
		super();
		this.id = id;
		this.numero = numero;
		this.dataCadastro = dataCadastro;
		this.logradouro = logradouro;
	}
	// Getters
	public int getId() {
		return id;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getReferencia() {
		return referencia;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public Logradouro getLogradouro() {
		return logradouro;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	
	
}//CLASS