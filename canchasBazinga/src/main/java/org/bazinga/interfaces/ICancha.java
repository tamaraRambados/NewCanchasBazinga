package org.bazinga.interfaces;

import org.bazinga.entities.Cancha;

import javax.xml.ws.Response;
import java.util.List;

public interface ICancha {
	
	//public List<Cancha> getCanchas(CriterioBusquedas... criterio);
	public boolean alta(Cancha cancha);
	public boolean baja(Cancha cancha);
	public boolean modificar(Cancha cancha);
    public Response registrar(Cancha cancha);
    public List<Cancha> getAllCancha();
}
