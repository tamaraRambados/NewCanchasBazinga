package org.bazinga.interfaces;


import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;

import javax.ws.rs.core.Response;

import java.util.List;

public interface IEstablecimiento {

    public MensajeEstado registrar(Establecimiento establecimiento);
    public MensajeEstado actualizar(Establecimiento establecimiento);
    public MensajeEstado eliminar(Establecimiento establecimiento);
    public List<Establecimiento> getAllEstablecimientos();
    public List<Establecimiento> getEstablecimientoPorUsuario(Usuario usuario);
    public List<Cancha> getCanchasPorEstablecimiento();
    public Establecimiento getEstablecimiento(int id);

}
