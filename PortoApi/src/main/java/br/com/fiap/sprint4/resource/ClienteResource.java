package br.com.fiap.sprint4.resource;

import java.sql.SQLException;

import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.service.ClienteService;
import br.com.fiap.sprint4.utils.ClienteUtils;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/cliente")
public final class ClienteResource {
	// Atributos
	private ClienteService service;
	// Construtor
	public ClienteResource() throws ClassNotFoundException, SQLException {
		service = new ClienteService();
	}
	
	// Autenticar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response autenticar(@HeaderParam("authorization") String authString) throws SQLException{
		try {
			String[] credentials = ClienteUtils.decodeAuth(authString);
			return Response.ok(service.autenticar(credentials[0], credentials[1])).build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}// Autenticar FIM
}//CLASS