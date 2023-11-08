package br.com.fiap.sprint4.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Chamado {
	// Atributos
	private int id;
	private char status;
	// TODO MUDAR NO BANCO PRA 1 ATRIBUTO
	@JsonFormat(pattern = "dd-MM-yyyy'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
	private LocalDateTime dataOcorrencia;
	private String descricaoGuincho;
	private String nomeEndereco;
	private Veiculo veiculo;
	
	// Construtores
	public Chamado(int id, char status, LocalDateTime dataOcorrencia, String descricaoGuincho, String nomeEndereco,
			Veiculo veiculo) {
		super();
		this.id = id;
		this.status = status;
		this.dataOcorrencia = dataOcorrencia;
		this.descricaoGuincho = descricaoGuincho;
		this.nomeEndereco = nomeEndereco;
		this.veiculo = veiculo;
	}
	public Chamado() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public char getStatus() {
		return status;
	}
	public LocalDateTime getDataOcorrencia() {
		return dataOcorrencia;
	}
	public String getDescricaoGuincho() {
		return descricaoGuincho;
	}
	public String getNomeEndereco() {
		return nomeEndereco;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public void setDescricaoGuincho(String descricaoGuincho) {
		this.descricaoGuincho = descricaoGuincho;
	}
	public void setNomeEndereco(String nomeEndereco) {
		this.nomeEndereco = nomeEndereco;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}//CLASS