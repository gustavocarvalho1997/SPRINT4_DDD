package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Cliente {
	// Atributos
	private int id;
	private PlanoDeSeguro planoDeSeguro;
	private String cpf;
	private String nome;
	private String email;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataNascimento;
	private char sexo;
	private String senha;
	
	// Construtores
	public Cliente(int id, PlanoDeSeguro planoDeSeguro, String cpf, String nome, String email, LocalDate dataNascimento,
			char sexo, String senha) {
		super();
		this.id = id;
		this.planoDeSeguro = planoDeSeguro;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.senha = senha;
	}
	public Cliente() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public PlanoDeSeguro getPlanoDeSeguro() {
		return planoDeSeguro;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public String getSenha() {
		return senha;
	}
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setPlanoDeSeguro(PlanoDeSeguro planoDeSeguro) {
		this.planoDeSeguro = planoDeSeguro;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}//CLASS