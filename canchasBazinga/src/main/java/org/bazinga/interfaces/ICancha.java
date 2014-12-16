package org.bazinga.interfaces;

import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import java.util.Calendar;
import java.util.List;

public interface ICancha {
	public Object eliminar(Cancha cancha);
	public Object actualizar(Cancha cancha);
    public Object registrar(Cancha cancha);
    public List<Cancha> getAllCancha();
    public List<Cancha> getCanchaPorEstablecimiento(Establecimiento establecimiento);
    public List<Cancha> getCanchaPorFecha(Calendar date);
    public List<Cancha> getCanchasLibre(Calendar  date);
     
}
