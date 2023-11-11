package br.com.fiap.sprint4.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.sprint4.models.Bairro;
import br.com.fiap.sprint4.models.Cidade;
import br.com.fiap.sprint4.models.Cliente;
import br.com.fiap.sprint4.models.Endereco;
import br.com.fiap.sprint4.models.Estado;
import br.com.fiap.sprint4.models.Logradouro;

public final class EnderecoUtils {
	// PARSE INICIO
	public static Endereco parse(ResultSet rs) throws SQLException {
		int idEndereco = rs.getInt("ID_ENDERECO");
		int idLogradouro = rs.getInt("ID_LOGRADOURO");
		int numeroLogradouro = rs.getInt("NR_LOGRADOURO");
		String complemento = rs.getString("DS_NUM_COMPLEMENTO");
		String referencia = rs.getString("DS_PONTO_REFERENCIA");
		LocalDate dataCadastroEndereco = rs.getObject("DT_ENDERECO", LocalDate.class);
		int idBairro = rs.getInt("ID_BAIRRO");
		String nomeLogradouro = rs.getString("NM_LOGRADOURO");
		long cep = rs.getInt("NR_CEP");
		LocalDate dataCadastroLogradouro = rs.getObject("DT_LOGRADOURO", LocalDate.class);
		int idCidade = rs.getInt("ID_CIDADE");
		String nomeBairro = rs.getString("NM_BAIRRO");
		String zona = rs.getString("NM_ZONA");
		LocalDate dataCadastroBairro = rs.getObject("DT_BAIRRO", LocalDate.class);
		int idEstado = rs.getInt("ID_ESTADO");
		String nomeCidade = rs.getString("NM_CIDADE");
		int ddd = rs.getInt("NR_DDD");
		LocalDate dataCadastroCidade = rs.getObject("DT_CIDADE", LocalDate.class);
		String siglaEstado = rs.getString("SG_ESTADO");
		String nomeEstado = rs.getString("NM_ESTADO");
		LocalDate dataCadastroEstado = rs.getObject("DT_ESTADO", LocalDate.class);
		
		Estado estado = new Estado(idEstado, siglaEstado, nomeEstado, dataCadastroEstado);
		Cidade cidade = new Cidade(idCidade, estado, nomeCidade, ddd, dataCadastroCidade);
		Bairro bairro = new Bairro(idBairro, cidade, nomeBairro, zona, dataCadastroBairro);
		Logradouro logradouro =  new Logradouro(idLogradouro, bairro, nomeLogradouro, cep, dataCadastroLogradouro);
		Endereco endereco = new Endereco(idEndereco, numeroLogradouro, dataCadastroEndereco, logradouro);
		if(complemento != null) {
			endereco.setComplemento(complemento);
		}
		if(referencia != null) {
			endereco.setReferencia(referencia);
		}
		return endereco;
	}//PARSE FIM
	
	// areCredentialsValid INICIO
	public static boolean areCredentialsValid(Cliente cliente, Endereco endereco) {
		return (cliente.getEndereco().getId() == endereco.getId());
	}// areCredentialsValid FIM
}//CLASS