package br.com.fiap.sprint4.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.sprint4.exception.InvalidCredentialsException;
import br.com.fiap.sprint4.models.Veiculo;
import br.com.fiap.sprint4.service.CaminhaoService;
import br.com.fiap.sprint4.utils.ClienteUtils;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/caminhao")
public final class CaminhaoResource {
	// Atributo
	private CaminhaoService service;
	// Construtor
	public CaminhaoResource() throws ClassNotFoundException, SQLException {
		service = new CaminhaoService();
	}
	
	// Listar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(@HeaderParam("authorization") String authString) throws SQLException {
		try {
			String[] credentials = ClienteUtils.decodeAuth(authString);
			List<Veiculo> lista = service.listar(credentials[0], credentials[1]);
			return Response.ok(lista).build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}// Listar FIM
}//CLASS