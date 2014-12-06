package org.bazinga.servicios;

import java.util.List;

import javax.ejb.Stateless;

import java.net.URI;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IUsuario;
//no puedo hacer que implemente IUsuario porque parece que deja de ser un EJB, *** PREGUNTA A DARIO ****
//Como metemos interfaces si al final despues no nos deja hacer la inyeccion de dependecia, salvo que agreguemos una capa mas
@Stateless
public class UsuarioService{

	@PersistenceContext(unitName = "dataBase-pu")
    private EntityManager entityManager;
	
	@Context
	private UriInfo uriInfo;
	
	
	public List<Usuario> getUsuario() {		
		TypedQuery<Usuario> query = entityManager.createNamedQuery(Usuario.FIND_ALL,Usuario.class);
		return query.getResultList();	
	}

	
	public Response registrar(Usuario usuario){
		
		entityManager.persist(usuario);
		URI usuarioURI = uriInfo.getAbsolutePathBuilder().path(Long.toString(usuario.getUsuarioId())).build();
	    return Response.created(usuarioURI).build();
	}

	
	
}
