package br.com.fiap.sprint4.dao;

import java.sql.Connection;

public final class PlanoDeSeguroDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String PESQ_ID = "SELECT * FROM T_IEEE_PLANO_DE_SEGURO WHERE ID_PLANO_DE_SEGURO = ?";
	// Construtor
	public PlanoDeSeguroDao(Connection conn) {
		this.conn = conn;
	}
	
	
}//CLASS