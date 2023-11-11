package br.com.fiap.sprint4.dao;

import java.sql.Connection;

public final class EnderecoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String PESQ_ID = "SELECT END.ID_ENDERECO, END.ID_LOGRADOURO, END.NR_LOGRADOURO, END.DS_NUM_COMPLEMENTO, END.DS_PONTO_REFERENCIA, END.DT_CADASTRO, L.ID_BAIRRO, L.NM_LOGRADOURO, L.NR_CEP, L.DT_CADASTRO, B.ID_CIDADE, B.NM_BAIRRO, B.NM_ZONA, B.DT_CADASTRO, C.ID_ESTADO, C.NM_CIDADE, C.NR_DDD, C.DT_CADASTRO, EST.SG_ESTADO, EST.NM_ESTADO, EST.DT_CADASTRO FROM T_IEEE_ENDERECO END INNER JOIN T_IEEE_LOGRADOURO L ON (END.ID_LOGRADOURO = L.ID_LOGRADOURO) INNER JOIN T_IEEE_BAIRRO B ON (L.ID_BAIRRO = B.ID_BAIRRO) INNER JOIN T_IEEE_CIDADE C ON (B.ID_CIDADE = C.ID_CIDADE) INNER JOIN T_IEEE_ESTADO EST ON (C.ID_ESTADO = EST.ID_ESTADO) WHERE END.ID_ENDERECO = ?";
	// Construtor
	public EnderecoDao(Connection conn) {
		this.conn = conn;
	}
}//CLASS