package br.com.fiap.sprint4.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public abstract class Veiculo {
	// Atributos
	protected int id;
	protected String renavam;
	protected String modelo;
	protected String chassi;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	protected LocalDate dataVeiculo;
	protected double altura;
	protected double comprimento;
	protected double largura;
	protected String cor;
	
	// Construtores
	public Veiculo() {
		super();
	}
	public Veiculo(int id, String renavam, String modelo, String chassi, LocalDate dataVeiculo, double altura,
			double comprimento, double largura, String cor) {
		super();
		this.id = id;
		this.renavam = renavam;
		this.modelo = modelo;
		this.chassi = chassi;
		this.dataVeiculo = dataVeiculo;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
		this.cor = cor;
	}
	
	public Veiculo(int id, String renavam, String modelo, String chassi, LocalDate dataVeiculo, double altura,
			double comprimento, double largura) {
		super();
		this.id = id;
		this.renavam = renavam;
		this.modelo = modelo;
		this.chassi = chassi;
		this.dataVeiculo = dataVeiculo;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
	}
	// Getters
	public int getId() {
		return id;
	}
	public String getRenavam() {
		return renavam;
	}
	public String getModelo() {
		return modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public LocalDate getDataVeiculo() {
		return dataVeiculo;
	}
	public double getAltura() {
		return altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public String getCor() {
		return cor;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setDataVeiculo(LocalDate dataVeiculo) {
		this.dataVeiculo = dataVeiculo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}//CLASS