package br.com.fiap.sprint4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.models.PlanoDeSeguro;
import br.com.fiap.sprint4.utils.PlanoDeSeguroUtils;

public final class PlanoDeSeguroDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String PESQ_ID = "SELECT * FROM T_IEEE_PLANO_DE_SEGURO WHERE ID_PLANO_DE_SEGURO = ?";
	// Construtor
	public PlanoDeSeguroDao(Connection conn) {
		this.conn = conn;
	}
	
	// PesquisarPorId INICIO
	public PlanoDeSeguro pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado");
		}
		PlanoDeSeguro p = PlanoDeSeguroUtils.parse(rs);
		return p;
	}
}//CLASS