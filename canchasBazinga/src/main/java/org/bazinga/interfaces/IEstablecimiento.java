package org.bazinga.interfaces;


import org.bazinga.entities.Establecimiento;

import javax.ws.rs.core.Response;
import java.util.List;

public interface IEstablecimiento {

    public Response registrar(Establecimiento establecimiento);
    public List<Establecimiento> getAllEstablecimientos();

}
