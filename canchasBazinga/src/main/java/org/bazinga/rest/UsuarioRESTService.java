package org.bazinga.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bazinga.service.IUsuario;
import org.bazinga.servicios.imp.UsuarioService;
import org.bazinga.entities.Usuario;

@Path("usuarios")
public class UsuarioRESTService implements IUsuario{

	@Inject
	UsuarioService usuarioService;
	
	
	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> obtenerTodosLosUsuarios(){
	 	return usuarioService.getUsuario(); 			
	}
	
	//curl -X POST --data-binary "verdura:{\"nombre\":\"Lechuga\",\"description\":\"la lechuga sirve para ensaladas\",\"precioUnitario\": 20.12}" -H "Content-Type: application/json" http://localhost:8080/Verduleria/api/verduras/guardar -v
	@POST
	@Path("registrar")	
	public Response guardar(Usuario usuario){
			return usuarioService.registrar(usuario);
	}

	
}
