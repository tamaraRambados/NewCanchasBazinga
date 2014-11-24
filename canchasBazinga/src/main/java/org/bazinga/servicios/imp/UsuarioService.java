package org.bazinga.servicios.imp;

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
import org.bazinga.service.IUsuario;
//no puedo hacer que implemente IUsuario porque parece que deja de ser un EJB, *** PREGUNTA A DARIO ****
//Como metemos interfaces si al final despues no nos deja hacer la inyeccion de dependecia, salvo que agreguemos una capa mas
@Stateless
public class UsuarioService{

	@PersistenceContext(unitName = "cancha-pu")
    private EntityManager entityManager;
	
	@Context
	private UriInfo uriInfo;
	
	
	public List<Usuario> getUsuario() {		
		TypedQuery<Usuario> query = entityManager.createNamedQuery(Usuario.FIND_ALL,Usuario.class);
		return query.getResultList();	
	}
	
	
	public Response registrar(Usuario usuario){
		entityManager.getTransaction().begin();	
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
		URI bookUri = uriInfo.getAbsolutePathBuilder().path(Long.toString(usuario.getIdUsuario())).build();
	    return Response.created(bookUri).build();
	}
	
	/*public void registrarEstatico(){
		Usuario u = new Usuario("isifc.facu@gmail.com",17422,"facundo","aguirre",35038452,"lopez y planes",36243,"1");
		entityManager.getTransaction().begin();
		entityManager.persist(u);
		entityManager.getTransaction().commit();
		 //URI bookUri = uriInfo.getAbsolutePathBuilder().path(Long.toString(u.getIdUsuario())).build();
		// return Response.created(bookUri).build();
	}*/
	
}
