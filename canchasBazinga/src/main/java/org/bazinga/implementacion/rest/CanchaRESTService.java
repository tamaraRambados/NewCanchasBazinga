package org.bazinga.implementacion.rest;

import org.bazinga.entities.Cancha;
import org.bazinga.interfaces.ICancha;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
@Path("canchas")
public class CanchaRESTService implements ICancha{
	
	@Inject
    ICancha iCanchas;

    @Override
    public Response eliminar(Cancha cancha) {
        return null;
    }

    @Override
    public Response acutalizar(Cancha cancha) {
        return null;
    }

    @POST
  	@Path("registrar")
    @Override
    public Response registrar(Cancha cancha) {
        return iCanchas.registrar(cancha);
    }

    @GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Cancha> getAllCancha() {       
    	return iCanchas.getAllCancha();
    }
}
