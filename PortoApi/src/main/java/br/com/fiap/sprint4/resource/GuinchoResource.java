package br.com.fiap.sprint4.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.sprint4.models.Veiculo;
import br.com.fiap.sprint4.service.GuinchoService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guinchos")
public final class GuinchoResource {
	// Atributos
	private GuinchoService service;
	// Construtor
	public GuinchoResource() throws ClassNotFoundException, SQLException {
		service = new GuinchoService();
	}
	
	// Listar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Veiculo> listar() throws SQLException {
		return service.listar();
	}// Listar FIM
}//CLASS