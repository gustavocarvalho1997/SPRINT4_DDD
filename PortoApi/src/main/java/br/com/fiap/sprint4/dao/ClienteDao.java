package br.com.fiap.sprint4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.utils.ClienteUtils;

public final class ClienteDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String AUTENTICAR = "SELECT * FROM T_IEEE_CLIENTE WHERE DS_EMAIL = ? AND DS_SENHA = ?";

	// Construtor
	public ClienteDao(Connection conn) {
		this.conn = conn;
	}
	
	// Autenticar INICIO
	public Cliente autenticar(String email, String senha) throws SQLException, InvalidCredentialsException {
		PreparedStatement stm = conn.prepareStatement(AUTENTICAR);
		stm.setString(1, email);
		stm.setString(2, senha);
		
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new InvalidCredentialsException("Email ou senha incorretos!");
		}
		
		Cliente cliente = ClienteUtils.parse(rs);
		return cliente;
	}// Autenticar FIM
	
}//CLASS