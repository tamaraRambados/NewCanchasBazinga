package org.bazinga.serviceTest;

import java.util.ArrayList;
import java.util.List;

import org.bazinga.entities.Cancha;
import org.bazinga.entities.Establecimiento;
import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IEstablecimiento;

public class EstablecimientoServiceMOCK implements IEstablecimiento{

	private static EstablecimientoServiceMOCK instance;
	private UsuarioServiceMOCK usuario=UsuarioServiceMOCK.getClase();
	private Establecimiento establecimiento;
	private List<Establecimiento> establecimientos= new ArrayList<Establecimiento>();
	
	public static EstablecimientoServiceMOCK getclase(){
		if (instance== null){
			instance= new EstablecimientoServiceMOCK();
		}
		return instance;
	}
	
	private EstablecimientoServiceMOCK() {
		
		establecimiento= new Establecimiento();
		establecimiento.setEstablecimientoId(1);
		establecimiento.setNombre("Savin");
		establecimiento.setTelefono(3624);
		establecimiento.setUsuarioDueños(usuario.getAllUsuario());
		establecimientos.add(establecimiento);
	}
	
	
	
	@Override
	public MensajeEstado registrar(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado actualizar(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado eliminar(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Establecimiento> getAllEstablecimientos() {
		// TODO Auto-generated method stub
		return establecimientos;
	}

	@Override
	public List<Establecimiento> getEstablecimientoPorUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancha> getCanchasPorEstablecimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Establecimiento getEstablecimiento(int id) {
		
		return establecimientos.get(id);
	}

}
