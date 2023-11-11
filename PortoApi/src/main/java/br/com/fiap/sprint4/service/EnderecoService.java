package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.sprint4.dao.ClienteDao;
import br.com.fiap.sprint4.dao.EnderecoDao;
import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.models.Endereco;
import br.com.fiap.sprint4.utils.EnderecoUtils;

public final class EnderecoService {
	// Atributos
	private EnderecoDao enderecoDao;
	private ClienteDao clienteDao;
	
	// Construtor
	public EnderecoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		enderecoDao = new EnderecoDao(conn);
		clienteDao = new ClienteDao(conn);
	}
	
	// PesquisarPorId INICIO
	public Endereco pesquisarPorId(String email, String senha, int id) throws SQLException, IdNotFoundException, InvalidCredentialsException {
		Endereco endereco = enderecoDao.pesquisarPorId(id);
		Cliente cliente = clienteDao.autenticar(email, senha);
		boolean isValid = EnderecoUtils.areCredentialsValid(cliente, endereco);
		if(!isValid) {
			throw new InvalidCredentialsException("O endereco em questão, não pertence a esse cliente!");
		}
		return endereco;
	}
}//CLASS