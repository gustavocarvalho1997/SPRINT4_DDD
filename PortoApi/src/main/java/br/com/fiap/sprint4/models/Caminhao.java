package br.com.fiap.sprint4.models;

import java.time.LocalDate;

public final class Caminhao extends Veiculo{
	// Atributos
	private int idCaminhao;
	private int qtdEixos;
	private double peso;
	
	// Construtores
	public Caminhao(int id, String renavam, String modelo, String chassi, LocalDate dataVeiculo, double altura,
			double comprimento, double largura, String cor, int idCaminhao, int qtdEixos, double peso) {
		super(id, renavam, modelo, chassi, dataVeiculo, altura, comprimento, largura, cor);
		this.idCaminhao = idCaminhao;
		this.qtdEixos = qtdEixos;
		this.peso = peso;
	}
	public Caminhao() {
		super();
	}
	
	// Getters
	public int getIdCaminhao() {
		return idCaminhao;
	}
	public int getQtdEixos() {
		return qtdEixos;
	}
	public double getPeso() {
		return peso;
	}
	
	// Setters
	public void setIdCaminhao(int idCaminhao) {
		this.idCaminhao = idCaminhao;
	}
	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}//CLASS