package org.bazinga.interfaces;

import org.bazinga.entities.Cancha;

import javax.ws.rs.core.Response;
import java.util.List;

public interface ICancha {
	public Response eliminar(Cancha cancha);
	public Response acutalizar(Cancha cancha);
    public Response registrar(Cancha cancha);
    public List<Cancha> getAllCancha();
}
