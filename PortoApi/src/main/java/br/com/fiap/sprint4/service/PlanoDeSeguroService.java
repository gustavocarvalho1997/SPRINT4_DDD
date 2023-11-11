package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.sprint4.dao.PlanoDeSeguroDao;
import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.PlanoDeSeguro;

public final class PlanoDeSeguroService {
	// Atributos
	private PlanoDeSeguroDao planoDeSeguroDao;
	
	// Construtor
	public PlanoDeSeguroService() throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		planoDeSeguroDao = new PlanoDeSeguroDao(conn);
	}
	
	// PesquisarPorId INICIO
	public PlanoDeSeguro pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		return planoDeSeguroDao.pesquisarPorId(id);
	}// PesquisarPorId FIM
}//CLASS