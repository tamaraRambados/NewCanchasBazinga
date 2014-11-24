package org.bazinga.servicios.imp;


import org.bazinga.entities.Cancha;
import org.bazinga.entities.Usuario;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

public class CanchaService{


    @PersistenceContext(unitName = "cancha-pu")
    private EntityManager entityManager;

    @Context
    private UriInfo uriInfo;

    public List<Cancha> getAllCancha(){
        TypedQuery<Cancha> query = entityManager.createNamedQuery(Cancha.FIND_ALL,Cancha.class);
        return query.getResultList();
    }

    public Response registrar(Cancha cancha){
        entityManager.persist(cancha);
        URI bookUri = uriInfo.getAbsolutePathBuilder().path(Long.toString(cancha.getIdCancha())).build();
        return Response.created(bookUri).build();
    }

}
