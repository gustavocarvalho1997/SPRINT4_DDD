package br.com.fiap.sprint4.resource;

import java.sql.SQLException;

import br.com.fiap.sprint4.service.CaminhaoService;
import jakarta.ws.rs.Path;

@Path("/caminhao")
public final class CaminhaoResource {
	// Atributo
	private CaminhaoService service;
	// Construtor
	public CaminhaoResource() throws ClassNotFoundException, SQLException {
		service = new CaminhaoService();
	}
}//CLASS