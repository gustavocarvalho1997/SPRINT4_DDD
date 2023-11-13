package br.com.fiap.sprint4.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.sprint4.dao.CaminhaoDao;
import br.com.fiap.sprint4.dao.ClienteDao;
import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.factory.ConnectionFactory;
import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.models.Veiculo;

public final class CaminhaoService {
	// Atributos
	private CaminhaoDao caminhaoDao;
	private ClienteDao clienteDao;
	// Construtor
	public CaminhaoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		caminhaoDao = new CaminhaoDao(conn);
		clienteDao = new ClienteDao(conn);
	}
	
	// Listar INICIO
	public List<Veiculo> listar(String email, String senha) throws SQLException, InvalidCredentialsException {
		Cliente c = clienteDao.autenticar(email, senha);
		return caminhaoDao.listar(c);
	}// Listar FIM
}//CLASS