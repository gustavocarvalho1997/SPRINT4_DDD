package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Estado {
	// Atributos
	private int id;
	private String sigla;
	private String nome;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	
	// Construtores
	public Estado(int id, String sigla, String nome, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
	}
	public Estado() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}//CLASS