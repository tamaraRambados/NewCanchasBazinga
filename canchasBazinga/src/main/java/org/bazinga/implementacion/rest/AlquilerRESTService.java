package org.bazinga.implementacion.rest;

import org.bazinga.entities.Alquiler;
import org.bazinga.interfaces.IAlquiler;

import javax.ws.rs.core.Response;
import java.util.List;


public class AlquilerRESTService implements IAlquiler {


    @Override
    public Response registar(Alquiler alquiler) {
        return null;
    }

    @Override
    public List<Alquiler> getAllAlquileres() {
        return null;
    }

    @Override
    public Response actualizar(Alquiler alquiler) {
        return null;
    }


}
