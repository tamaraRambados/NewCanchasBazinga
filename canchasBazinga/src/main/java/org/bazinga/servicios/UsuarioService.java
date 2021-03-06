/*package org.bazinga.servicios;

import java.util.List;

import javax.ejb.Stateless;

import java.net.URI;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IUsuario;

@Stateless
public class UsuarioService implements IUsuario{

	@PersistenceContext(unitName = "dataBase-pu")
    private EntityManager entityManager;
	
	@Context
	private UriInfo uriInfo;
	MensajeEstado mensaje;
	
	public MensajeEstado registrar(Usuario usuario){	
		entityManager.persist(usuario);
		//URI usuarioURI = uriInfo.getAbsolutePathBuilder().path(Long.toString(usuario.getUsuarioId())).build();
	    //return Response.created(usuarioURI).build();
	    mensaje= new MensajeEstado();
        mensaje.setEstado(true);
        mensaje.setMensaje("se registro correctamente");
        return mensaje;
	}


	@Override
	public List<Usuario> getAllUsuario() {
		TypedQuery<Usuario> query = entityManager.createNamedQuery(Usuario.FIND_ALL,Usuario.class);
		return query.getResultList();	
	}




	@Override
	public boolean loguearse(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public MensajeEstado eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}*/
