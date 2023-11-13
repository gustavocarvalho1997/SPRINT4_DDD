package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Cidade {
	// Atributos
	private int id;
	private Estado estado;
	private String nome;
	private int ddd;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	
	// Construtores
	public Cidade(int id, Estado estado, String nome, int ddd, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.estado = estado;
		this.nome = nome;
		this.ddd = ddd;
		this.dataCadastro = dataCadastro;
	}
	public Cidade() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Estado getEstado() {
		return estado;
	}
	public String getNome() {
		return nome;
	}
	public int getDdd() {
		return ddd;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}//CLASS	