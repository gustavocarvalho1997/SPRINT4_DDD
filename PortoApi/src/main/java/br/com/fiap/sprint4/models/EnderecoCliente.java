package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class EnderecoCliente {
	// Atributos
	private int id;
	private Cliente cliente;
	private Logradouro logradouro;
	private int numero;
	private String complemento;
	private String pontoDeReferencia;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataInicio;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataFim;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataCadastro;
	// TODO VERIFICAR
	private String nomeUsuario;
	
	// Construtores;
	public EnderecoCliente(int id, Cliente cliente, Logradouro logradouro, int numero, String complemento,
			String pontoDeReferencia, LocalDate dataInicio, LocalDate dataFim, LocalDate dataCadastro,
			String nomeUsuario) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.pontoDeReferencia = pontoDeReferencia;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.dataCadastro = dataCadastro;
		this.nomeUsuario = nomeUsuario;
	}
	public EnderecoCliente() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Logradouro getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
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
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	// TODO VERIFICAR
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
}//CLASS