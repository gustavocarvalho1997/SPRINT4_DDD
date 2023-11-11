package br.com.fiap.sprint4.resource;

import java.sql.SQLException;

import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.models.Endereco;
import br.com.fiap.sprint4.service.EnderecoService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/endereco")
public final class EnderecoResource {
	// Atributo
	private EnderecoService service;
	
	// Construtor
	public EnderecoResource() throws ClassNotFoundException, SQLException {
		service = new EnderecoService();
	}
	
	// PesquisarPorId INICIO
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarPorId(@PathParam("id") int id) throws ClassNotFoundException, SQLException{
		try {
			Endereco endereco = service.pesquisarPorId(id);
			return Response.ok(endereco).build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}// PesquisarPorId FIM
}//CLASS