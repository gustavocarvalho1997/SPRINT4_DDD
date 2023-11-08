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
	//TODO verificar atributo
	private String nomeUsuario;
	
	// Construtores
	public Estado(int id, String sigla, String nome, LocalDate dataCadastro, String nomeUsuario) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.nomeUsuario = nomeUsuario;
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
	// TODO VERIFICAR
	public String getNomeUsuario() {
		return nomeUsuario;
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
	// TODO VERIFICAR
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
}//CLASS