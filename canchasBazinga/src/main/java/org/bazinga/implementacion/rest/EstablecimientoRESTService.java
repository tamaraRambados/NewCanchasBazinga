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
public class EstablecimientoRESTService implements IEstablecimiento {


    @Inject
    EstablecimientoService establecimientoService;

    @Path("registrar")
    @POST
    @Override
    public Response registrar(Establecimiento establecimiento) {
        return  establecimientoService.registrar(establecimiento);
    }

    @Path("lista")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Establecimiento> getAllEstablecimientos() {
        return establecimientoService.getAllEstablecimientos();
    }
}
