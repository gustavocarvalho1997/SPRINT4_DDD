package br.com.fiap.sprint4.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.sprint4.models.Guincho;

public final class GuinchoUtils {
	// INICIO PARSE
	private Guincho parse(ResultSet rs) throws SQLException {
		int idVeiculo = rs.getInt("ID_VEICULO");
		String renavam =  rs.getString("CD_RENAVAM");
		String modelo = rs.getString("NM_MODELO");
		String chassi = rs.getString("TP_CHASSI");
		LocalDate dataVeiculo = rs.getObject("DT_VEICULO", LocalDate.class);
		double altura = rs.getDouble("NR_ALTURA");
		double comprimento = rs.getDouble("NR_COMPRIMENTO");
		double largura = rs.getDouble("NR_LARGURA");
		String cor = rs.getString("NM_COR");
		int idGuincho = rs.getInt("ID_GUINCHO");
		double maxToneladas = rs.getDouble("NR_MAX_TONELADAS");
		double maxComprimento = rs.getDouble("NR_MAX_COMPRIMENTO");
		String descricao = rs.getString("DS_GUINCHO");
		
		Guincho g = new Guincho(idVeiculo, renavam, modelo, chassi, dataVeiculo, altura, comprimento, largura, idGuincho, maxToneladas, maxComprimento, descricao);
		if(cor != null) {
			g.setCor(cor);
		}
		return g;
	}// FIM PARSE
}//CLASS