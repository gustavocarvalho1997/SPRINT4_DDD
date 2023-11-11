package br.com.fiap.sprint4.resource;

import java.sql.SQLException;

import br.com.fiap.sprint4.service.PlanoDeSeguroService;
import jakarta.ws.rs.Path;

@Path("/plano")
public final class PlanoDeSeguroResource {
	// Atributo
	private PlanoDeSeguroService service;
	// Construtor
	public PlanoDeSeguroResource() throws ClassNotFoundException, SQLException {
		service = new PlanoDeSeguroService();
	}
}//CLASS