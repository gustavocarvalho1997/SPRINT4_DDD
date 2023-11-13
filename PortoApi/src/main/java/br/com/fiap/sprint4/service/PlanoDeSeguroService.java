package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.sprint4.dao.ClienteDao;
import br.com.fiap.sprint4.dao.PlanoDeSeguroDao;
import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.models.PlanoDeSeguro;
import br.com.fiap.sprint4.utils.PlanoDeSeguroUtils;

public final class PlanoDeSeguroService {
	// Atributos
	private PlanoDeSeguroDao planoDeSeguroDao;
	private ClienteDao clienteDao;
	
	// Construtor
	public PlanoDeSeguroService() throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		planoDeSeguroDao = new PlanoDeSeguroDao(conn);
		clienteDao = new ClienteDao(conn);
	}
	
	// PesquisarPorId INICIO
	public PlanoDeSeguro pesquisarPorId(String email, String senha, int id) throws SQLException, IdNotFoundException, InvalidCredentialsException{
		PlanoDeSeguro p = planoDeSeguroDao.pesquisarPorId(id);
		Cliente c = clienteDao.autenticar(email, senha);
		boolean isValid = PlanoDeSeguroUtils.areCredentialsValid(c, p);
		if(!isValid) {
			throw new InvalidCredentialsException("O plano em questão, não pertence a esse cliente!");
		}
		return p;
	}// PesquisarPorId FIM
}//CLASS