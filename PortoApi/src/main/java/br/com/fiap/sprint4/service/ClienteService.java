package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.sprint4.dao.ClienteDao;
import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Cliente;

public final class ClienteService {
	// Atributos
	private ClienteDao clienteDao;
	
	// Construtor
	public ClienteService() throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		clienteDao = new ClienteDao(conn);
	}
	
	// Autenticar INICIO
	public Cliente autenticar(String email, String senha) throws SQLException, InvalidCredentialsException {
		return clienteDao.autenticar(email, senha);
	}// Autenticar FIM
}//CLASS