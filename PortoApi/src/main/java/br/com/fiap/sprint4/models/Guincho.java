package br.com.fiap.sprint4.models;

import java.time.LocalDate;

public final class Guincho extends Veiculo{
	// Atributos
	private int idGuincho;
	private double maxToneladas;
	private double maxComprimento;
	private String descricao;
	
	// Construtores
	public Guincho() {
		super();
	}
	public Guincho(int id, String renavam, String modelo, String chassi, LocalDate dataVeiculo, double altura,
			double comprimento, double largura, String cor, int idGuincho, double maxToneladas, double maxComprimento,
			String descricao) {
		super(id, renavam, modelo, chassi, dataVeiculo, altura, comprimento, largura, cor);
		this.idGuincho = idGuincho;
		this.maxToneladas = maxToneladas;
		this.maxComprimento = maxComprimento;
		this.descricao = descricao;
	}
	
	public Guincho(int id, String renavam, String modelo, String chassi, LocalDate dataVeiculo, double altura,
			double comprimento, double largura, int idGuincho, double maxToneladas, double maxComprimento,
			String descricao) {
		super(id, renavam, modelo, chassi, dataVeiculo, altura, comprimento, largura);
		this.idGuincho = idGuincho;
		this.maxToneladas = maxToneladas;
		this.maxComprimento = maxComprimento;
		this.descricao = descricao;
	}
	// Getters
	public int getIdGuincho() {
		return idGuincho;
	}
	public double getMaxToneladas() {
		return maxToneladas;
	}
	public double getMaxComprimento() {
		return maxComprimento;
	}
	public String getDescricao() {
		return descricao;
	}
	
	// Setters
	public void setIdGuincho(int idGuincho) {
		this.idGuincho = idGuincho;
	}
	public void setMaxToneladas(double maxToneladas) {
		this.maxToneladas = maxToneladas;
	}
	public void setMaxComprimento(double maxComprimento) {
		this.maxComprimento = maxComprimento;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}//CLASS