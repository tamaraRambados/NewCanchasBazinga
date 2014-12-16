package org.bazinga.interfaces;


import org.bazinga.entities.Alquiler;
import org.bazinga.entities.Usuario;

import javax.ws.rs.core.Response;

import java.util.List;

public interface IAlquiler {
	
    public Object registar(Alquiler alquiler);
    public List<Alquiler> getAllAlquileres();
    public Object actualizar(Alquiler alquiler);
    public List<Alquiler> getAllAlquileresPorUsuario(Usuario usuario);
    public Object eliminar(Alquiler alquiler);
    //la idea es levantar un proceso que elimine una serie de alquileres tras sierto tiempo, alquileres que nunca se concretaron
    public Object eliminarPorTiempo();

}
