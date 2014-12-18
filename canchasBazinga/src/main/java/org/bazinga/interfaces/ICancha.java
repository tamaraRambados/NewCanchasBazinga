package org.bazinga.interfaces;

import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.MensajeEstado;

import java.util.Calendar;
import java.util.List;

public interface ICancha {
	public MensajeEstado eliminar(Cancha cancha);
	public MensajeEstado actualizar(Cancha cancha);
    public MensajeEstado registrar(Cancha cancha);
    public List<Cancha> getAllCancha();
    public List<Cancha> getCanchaPorEstablecimiento(Establecimiento establecimiento);
    public List<Cancha> getCanchaPorFecha(Calendar date);
    public List<Cancha> getCanchasLibre(Calendar  date);
     
}
