package org.bazinga.servicios;


import org.bazinga.entities.Cancha;




import org.bazinga.entities.Establecimiento;
import org.bazinga.interfaces.ICancha;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.Calendar;
import java.util.List;
@Stateless
public class CanchaService implements ICancha{


    @PersistenceContext(unitName = "dataBase-pu")
    private EntityManager entityManager;

    @Context
    private UriInfo uriInfo;

    public List<Cancha> getAllCancha(){
        TypedQuery<Cancha> query = entityManager.createNamedQuery(Cancha.FIND_ALL,Cancha.class);
        return query.getResultList();
    }
    
    @Override
    public Response registrar(Cancha cancha){
        entityManager.persist(cancha);
        URI bookUri = uriInfo.getAbsolutePathBuilder().path(Long.toString(cancha.getIdCancha())).build();
        return Response.created(bookUri).build();
    }

	@Override
	public Response eliminar(Cancha cancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object actualizar(Cancha cancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchaPorEstablecimiento(
			Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchaPorFecha(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchasLibre(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	




}
