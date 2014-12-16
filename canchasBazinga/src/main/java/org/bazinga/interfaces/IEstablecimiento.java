package org.bazinga.interfaces;


import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.Usuario;

import javax.ws.rs.core.Response;

import java.util.List;

public interface IEstablecimiento {

    public Object registrar(Establecimiento establecimiento);
    public Object actualizar(Establecimiento establecimiento);
    public Object eliminar(Establecimiento establecimiento);
    public List<Establecimiento> getAllEstablecimientos();
    public List<Establecimiento> getEstablecimientoPorUsuario(Usuario usuario);
    public List<Cancha> getCanchasPorEstablecimiento();

}
