package org.bazinga.service;

import org.bazinga.entities.Cancha;

public interface ICancha {
	
	//public List<Cancha> getCanchas(CriterioBusquedas... criterio);
	public boolean alta(Cancha cancha);
	public boolean baja(Cancha cancha);
	public boolean modificar(Cancha cancha);
}
