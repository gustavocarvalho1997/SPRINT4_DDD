package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Logradouro {
	// Atributos
	private int id;
	private Bairro bairro;
	private String nome;
	private long cep;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	// TODO VERIFICAR
	private String nomeUsuario;
	
	// Construtores
	public Logradouro(int id, Bairro bairro, String nome, long cep, LocalDate dataCadastro, String nomeUsuario) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.nome = nome;
		this.cep = cep;
		this.dataCadastro = dataCadastro;
		this.nomeUsuario = nomeUsuario;
	}
	public Logradouro() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public String getNome() {
		return nome;
	}
	public long getCep() {
		return cep;
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
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	// TODO VERIFICAR
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
}//CLASS