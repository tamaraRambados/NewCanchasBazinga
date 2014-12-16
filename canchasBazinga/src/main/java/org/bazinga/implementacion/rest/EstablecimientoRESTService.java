package org.bazinga.implementacion.rest;

import org.bazinga.entities.Establecimiento;
import org.bazinga.interfaces.IEstablecimiento;
import org.bazinga.servicios.EstablecimientoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.List;

@Path("establecimientos")
public class EstablecimientoRESTService {


    @Inject
    IEstablecimiento iEstablecimiento;

    @Path("registrar")
    @POST
    public Response registrar(Establecimiento establecimiento) {
        return  (Response)iEstablecimiento.registrar(establecimiento);
    }

    @Path("lista")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Establecimiento> getAllEstablecimientos() {
        return iEstablecimiento.getAllEstablecimientos();
    }
}
