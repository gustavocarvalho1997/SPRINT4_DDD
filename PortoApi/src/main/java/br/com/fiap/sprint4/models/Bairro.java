package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Bairro {
	// Atributos
	private int id;
	private Cidade cidade;
	private String nome;
	private String zona;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	
	// Construtores
	public Bairro(int id, Cidade cidade, String nome, String zona, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.nome = nome;
		this.zona = zona;
		this.dataCadastro = dataCadastro;
	}
	public Bairro() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public String getNome() {
		return nome;
	}
	public String getZona() {
		return zona;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}//CLASS