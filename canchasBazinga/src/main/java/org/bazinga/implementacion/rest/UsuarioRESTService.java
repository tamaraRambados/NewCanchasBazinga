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
	UsuarioService usuarioService;
	
	
	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> getAllUsuario(){
		
	 	return usuarioService.getUsuario(); 			
	}

    @Override
    public boolean alta(Usuario usuario) {
        return false;
    }

    @Override
    public boolean baja(Usuario usuario) {
        return false;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean loguearse(Usuario usuario) {
        return false;
    }

    @POST
    @Path("registrar")
    public Response guardar(Usuario u){
    	/*Usuario u = new Usuario();
		u.setCorreoElectronico("isifc.facu@gmail.com");
		u.setApellido("aguirre");
		u.setNombre("facundo");
		u.setIdUsuario(17422);
		u.setDni(35038452);
		u.setDireccion("lopez y planes");
		u.setTelefono(36243);
		u.setTipoUsuario("cliente");
       return usuarioService.registrar(u);*/
    	return usuarioService.registrar(u);
    }


	
}
