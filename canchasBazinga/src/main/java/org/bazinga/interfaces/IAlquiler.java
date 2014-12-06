package org.bazinga.interfaces;


import org.bazinga.entities.Alquiler;

import javax.ws.rs.core.Response;
import java.util.List;

public interface IAlquiler {

    public Response registar(Alquiler alquiler);
    public List<Alquiler> getAllAlquileres();
    public Response actualizar(Alquiler alquiler);

}
