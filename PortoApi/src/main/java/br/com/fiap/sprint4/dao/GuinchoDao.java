package br.com.fiap.sprint4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.models.Guincho;
import br.com.fiap.sprint4.models.Veiculo;
import br.com.fiap.sprint4.utils.GuinchoUtils;


public final class GuinchoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT G.ID_GUINCHO, G.ID_VEICULO, G.NR_MAX_TONELADAS, G.NR_MAX_COMPRIMENTO, G.DS_GUINCHO, V.CD_RENAVAM, V.NM_MODELO, V.TP_CHASSI, V.DT_VEICULO, V.NR_ALTURA, V.NR_COMPRIMENTO, V.NR_LARGURA, V.NM_COR FROM T_IEEE_GUINCHO G INNER JOIN T_IEEE_VEICULO V ON (G.ID_VEICULO = V.ID_VEICULO)";
	private static final String PESQ_ID = "SELECT G.ID_GUINCHO, G.ID_VEICULO, G.NR_MAX_TONELADAS, G.NR_MAX_COMPRIMENTO, G.DS_GUINCHO, V.CD_RENAVAM, V.NM_MODELO, V.TP_CHASSI, V.DT_VEICULO, V.NR_ALTURA, V.NR_COMPRIMENTO, V.NR_LARGURA, V.NM_COR FROM T_IEEE_GUINCHO G INNER JOIN T_IEEE_VEICULO V ON (G.ID_VEICULO = V.ID_VEICULO) WHERE G.ID_GUINCHO = ?";
	// Construtor
	public GuinchoDao(Connection conn) {
		this.conn = conn;
	}
	
	// Listar INICIO
	public List<Veiculo> listar() throws SQLException {
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<Veiculo> lista = new ArrayList<>();
		while(rs.next()) {
			Guincho guincho = GuinchoUtils.parse(rs);
			lista.add(guincho);
		}
		return lista;
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public Guincho pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado");
		}
		
		Guincho guincho = GuinchoUtils.parse(rs);
		return guincho;
	}
}//CLASS