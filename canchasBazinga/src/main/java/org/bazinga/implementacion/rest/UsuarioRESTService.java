package org.bazinga.implementacion.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bazinga.servicios.UsuarioService;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IUsuario;

@Path("usuarios")
public class UsuarioRESTService implements IUsuario{

	@Inject
	IUsuario iUsuario;
	
	
	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> getAllUsuario(){
	 	return iUsuario.getAllUsuario(); 			
	}



    @Override
    public boolean loguearse(Usuario usuario) {
        return false;
    }

    @POST
    @Path("registrar")
    public Response guardar(Usuario u){
    	return iUsuario.registrar(u);
    }



	@Override
	public Response registrar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Response eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Response modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
