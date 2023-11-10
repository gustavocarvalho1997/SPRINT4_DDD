package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.sprint4.dao.GuinchoDao;
import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Guincho;
import br.com.fiap.sprint4.models.Veiculo;

public final class GuinchoService {
	// Atributos
	private GuinchoDao guinchoDao;
	
	// Construtor
	public GuinchoService() throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		guinchoDao = new GuinchoDao(conn);
	}
	
	// Listar INICIO
	public List<Veiculo> listar() throws SQLException {
		return guinchoDao.listar();
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public Guincho pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		return guinchoDao.pesquisarPorId(id);
	}// PesquisarPorId FIM
}//CLASS