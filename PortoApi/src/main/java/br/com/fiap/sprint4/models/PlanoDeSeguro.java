package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class PlanoDeSeguro {
	// Atributos
	private int id;
	private String tipoSeguro;
	private String descricaoCoberturas;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataContratacao;
	private String tipoVinculo;
	
	// Construtores
	public PlanoDeSeguro(int id, String tipoSeguro, String descricaoCoberturas, LocalDate dataContratacao,
			String tipoVinculo) {
		super();
		this.id = id;
		this.tipoSeguro = tipoSeguro;
		this.descricaoCoberturas = descricaoCoberturas;
		this.dataContratacao = dataContratacao;
		this.tipoVinculo = tipoVinculo;
	}
	public PlanoDeSeguro() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getTipoSeguro() {
		return tipoSeguro;
	}
	public String getDescricaoCoberturas() {
		return descricaoCoberturas;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public String getTipoVinculo() {
		return tipoVinculo;
	}
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	public void setDescricaoCoberturas(String descricaoCoberturas) {
		this.descricaoCoberturas = descricaoCoberturas;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public void setTipoVinculo(String tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}
}//CLASS