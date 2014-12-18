package org.bazinga.serviceTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.MensajeEstado;
import org.bazinga.interfaces.ICancha;

public class CanchaServiceMOCK implements ICancha{

	private EstablecimientoServiceMOCK establecimiento=EstablecimientoServiceMOCK.getclase();
	private List<Cancha> canchas= new ArrayList<Cancha>();
	private Cancha cancha;
	
	
	
	public CanchaServiceMOCK() {
		
		
		cancha=new Cancha();
		cancha.setIdCancha(1);
		cancha.setPrecio(120);
		cancha.setTipo("futbol");
		cancha.setEstablecimiento(establecimiento.getEstablecimiento(0));
		canchas.add(cancha);
		
		
		cancha=new Cancha();
		cancha.setIdCancha(2);
		cancha.setPrecio(120);
		cancha.setTipo("futbol");
		cancha.setEstablecimiento(establecimiento.getEstablecimiento(0));
		canchas.add(cancha);

		cancha=new Cancha();
		cancha.setIdCancha(3);
		cancha.setPrecio(220);
		cancha.setTipo("tennis");
		cancha.setEstablecimiento(establecimiento.getEstablecimiento(0));
		canchas.add(cancha);
	}
	
	@Override
	public MensajeEstado eliminar(Cancha cancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado actualizar(Cancha cancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado registrar(Cancha cancha) {
		// TODO Auto-generated method stub
		canchas.add(cancha);
		return null;
	}

	@Override
	public List<Cancha> getAllCancha() {
		// TODO Auto-generated method stub
		return canchas;
	}

	@Override
	public List<Cancha> getCanchaPorEstablecimiento(
			Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchaPorFecha(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchasLibre(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

}
