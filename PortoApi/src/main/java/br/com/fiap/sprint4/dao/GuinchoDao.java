package br.com.fiap.sprint4.dao;

import java.sql.Connection;

public final class GuinchoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT G.ID_GUINCHO, G.ID_VEICULO, G.NR_MAX_TONELADAS, G.NR_MAX_COMPRIMENTO, G.DS_GUINCHO, V.CD_RENAVAM, V.NM_MODELO, V.TP_CHASSI, V.DT_VEICULO, V.NR_ALTURA, V.NR_COMPRIMENTO, V.NR_LARGURA, V.NM_COR FROM T_IEEE_GUINCHO G INNER JOIN T_IEEE_VEICULO V ON (G.ID_VEICULO = V.ID_VEICULO);";
	// Construtor
	public GuinchoDao(Connection conn) {
		this.conn = conn;
	}
}//CLASS