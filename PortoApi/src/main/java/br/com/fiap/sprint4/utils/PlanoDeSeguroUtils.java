package br.com.fiap.sprint4.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.sprint4.models.PlanoDeSeguro;

public final class PlanoDeSeguroUtils {
	//PARSE INICIO
	public static PlanoDeSeguro parse(ResultSet rs) throws SQLException{
		int id = rs.getInt("ID_PLANO_DE_SEGURO");
		String tipo = rs.getString("TP_SEGURO");
		String cobertura = rs.getString("DS_COBERTURA");
		LocalDate dataContrato = rs.getObject("DT_CONTRATO", LocalDate.class);
		String vinculo = rs.getString("TP_VINCULO");
		
		PlanoDeSeguro p = new PlanoDeSeguro(id, tipo, cobertura, dataContrato, vinculo);
		return p;
	}// PARSE FIM
}//CLASS