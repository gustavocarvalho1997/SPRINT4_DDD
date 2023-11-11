package br.com.fiap.sprint4.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.sprint4.models.Caminhao;

public final class CaminhaoUtils {
	public static Caminhao parse(ResultSet rs) throws SQLException {
		int idVeiculo = rs.getInt("ID_VEICULO");
		String renavam =  rs.getString("CD_RENAVAM");
		String modelo = rs.getString("NM_MODELO");
		String chassi = rs.getString("TP_CHASSI");
		LocalDate dataVeiculo = rs.getObject("DT_VEICULO", LocalDate.class);
		double altura = rs.getDouble("NR_ALTURA");
		double comprimento = rs.getDouble("NR_COMPRIMENTO");
		double largura = rs.getDouble("NR_LARGURA");
		String cor = rs.getString("NM_COR");
		int idCaminhao = rs.getInt("ID_CAMINHAO");
		int qtdEixos = rs.getInt("QT_EIXOS");
		double peso = rs.getDouble("QT_PESO");
		
		Caminhao c = new Caminhao(idVeiculo, renavam, modelo, chassi, dataVeiculo, altura, comprimento, largura, idCaminhao, qtdEixos, peso);
		if(cor != null) {
			c.setCor(cor);
		}
		
		return c;
	}// FIM PARSE
}//CLASS