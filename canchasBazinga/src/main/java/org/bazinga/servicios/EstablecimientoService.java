package org.bazinga.servicios;

import org.bazinga.entities.Establecimiento;
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
public class EstablecimientoService {


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


}
