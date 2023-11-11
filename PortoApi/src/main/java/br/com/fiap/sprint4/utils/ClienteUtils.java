package br.com.fiap.sprint4.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.models.Endereco;
import br.com.fiap.sprint4.models.PlanoDeSeguro;

public final class ClienteUtils {
	private ClienteUtils() {
	}
	
	// INICIO PARSE
	public static Cliente parse(ResultSet rs) throws SQLException{
		int id = rs.getInt("ID_CLIENTE");
		int idPlano = rs.getInt("ID_PLANO_DE_SEGURO");
		String cpf = rs.getString("NR_CPF");
		String nome = rs.getString("NM_PESSOA");
		String email = rs.getString("DS_EMAIL");
		LocalDate dataNascimento = rs.getObject("DT_NASCIMENTO", LocalDate.class);
		char sexo = rs.getString("FL_SEXO_BIOLOGICO").charAt(0);
		int idEndereco = rs.getInt("ID_ENDERECO");
		String senha = rs.getString("DS_SENHA");
		
		Cliente cliente = new Cliente(id, null, cpf, nome, email, senha, null);
		if(idPlano > 0) {
			PlanoDeSeguro p = new PlanoDeSeguro(idPlano);
			cliente.setPlanoDeSeguro(p);
		}
		if(idEndereco > 0) {
			Endereco e = new Endereco(idEndereco);
			cliente.setEndereco(e);
		}
		if(dataNascimento != null) {
			cliente.setDataNascimento(dataNascimento);
		}
		if(sexo > 0) {
			cliente.setSexo(sexo);
		}
		return cliente;
	}// PARSE FIM
	
	// decodeAuth INICIO
	public static String[] decodeAuth(String authString) {
		String decodedAuth = "";
		String[] authParts = authString.split("\\s+");
		String authInfo = authParts[1];
		byte[] bytes = null;
		bytes = java.util.Base64.getDecoder().decode(authInfo);
		decodedAuth = new String(bytes);
		String[] credentials = decodedAuth.split(":");
		return credentials;
	}// decodeAuth FIM
}//CLASS