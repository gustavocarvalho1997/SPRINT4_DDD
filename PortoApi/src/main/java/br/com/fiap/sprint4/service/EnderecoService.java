package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.sprint4.dao.EnderecoDao;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Endereco;

public final class EnderecoService {
	// Atributos
	private EnderecoDao enderecoDao;
	
	// Construtor
	public EnderecoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		enderecoDao = new EnderecoDao(conn);
	}
	
	// PesquisarPorId INICIO
	public Endereco pesquisarPorId(int id) throws SQLException {
		return enderecoDao.pesquisarPorId(id);
	}
}//CLASS