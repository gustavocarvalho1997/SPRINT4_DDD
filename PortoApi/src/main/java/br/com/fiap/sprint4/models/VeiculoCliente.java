package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class VeiculoCliente {
	// Atributos
	private int id;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataAssociacao;
	private Veiculo veiculo;
	private Cliente cliente;
	
	// Construtores
	public VeiculoCliente(int id, LocalDate dataAssociacao, Veiculo veiculo, Cliente cliente) {
		super();
		this.id = id;
		this.dataAssociacao = dataAssociacao;
		this.veiculo = veiculo;
		this.cliente = cliente;
	}
	public VeiculoCliente() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public LocalDate getDataAssociacao() {
		return dataAssociacao;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setDataAssociacao(LocalDate dataAssociacao) {
		this.dataAssociacao = dataAssociacao;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}//CLASS