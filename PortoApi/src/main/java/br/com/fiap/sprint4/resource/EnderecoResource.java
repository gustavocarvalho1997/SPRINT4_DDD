package br.com.fiap.sprint4.resource;

import java.sql.SQLException;

import br.com.fiap.sprint4.exception.IdNotFoundException;
import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.models.Endereco;
import br.com.fiap.sprint4.service.EnderecoService;
import br.com.fiap.sprint4.utils.ClienteUtils;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
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
	public Response pesquisarPorId(@PathParam("id") int id, @HeaderParam("authorization") String authString) throws ClassNotFoundException, SQLException{
		try {
			String[] credentials = ClienteUtils.decodeAuth(authString);
			Endereco endereco = service.pesquisarPorId(credentials[0], credentials[1], id);
			return Response.ok(endereco).build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}// PesquisarPorId FIM
}//CLASS