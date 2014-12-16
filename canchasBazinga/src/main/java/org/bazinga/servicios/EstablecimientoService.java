package org.bazinga.servicios;

import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IEstablecimiento;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.List;

@Stateless
public class EstablecimientoService implements IEstablecimiento{


    @PersistenceContext(unitName = "dataBase-pu")
    private EntityManager entityManager;

    @Context
    private UriInfo uriInfo;

    public Response registrar(Establecimiento establecimiento) {
        entityManager.persist(establecimiento);
        URI establecimientoURI = uriInfo.getAbsolutePathBuilder().path(Long.toString(establecimiento.getEstablecimientoId())).build();
        return Response.created(establecimientoURI).build();
    }

    public List<Establecimiento> getAllEstablecimientos(){
        TypedQuery<Establecimiento> query = entityManager.createNamedQuery(Establecimiento.FIND_ALL,Establecimiento.class);
        return  query.getResultList();
    }

	@Override
	public Object actualizar(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eliminar(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Establecimiento> getEstablecimientoPorUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchasPorEstablecimiento() {
		// TODO Auto-generated method stub
		return null;
	}


}
