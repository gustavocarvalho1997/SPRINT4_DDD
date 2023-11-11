package br.com.fiap.sprint4.dao;

import java.sql.Connection;

public final class CaminhaoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT V.ID_VEICULO, V.CD_RENAVAM, V.NM_MODELO, V.TP_CHASSI, V.DT_VEICULO, V.NR_ALTURA, V.NR_COMPRIMENTO, V.NR_LARGURA, V.NM_COR, C.QT_EIXOS, C.QT_PESO FROM T_IEEE_VEICULO_CLIENTE VC INNER JOIN T_IEEE_VEICULO V ON (VC.ID_VEICULO = V.ID_VEICULO) INNER JOIN T_IEEE_CAMINHAO C ON (V.ID_VEICULO = C.ID_VEICULO) WHERE VC.ID_CLIENTE = ?";
	// Construtor
	public CaminhaoDao(Connection conn) {
		this.conn = conn;
	}
}//CLASS