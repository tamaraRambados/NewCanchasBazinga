package org.bazinga.serviceTest;

import java.util.List;

import org.bazinga.entities.Alquiler;
import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IAlquiler;

public class AlquilerServiceMOCK implements IAlquiler{

	@Override
	public MensajeEstado registar(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> getAllAlquileres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado actualizar(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> getAllAlquileresPorUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado eliminar(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eliminarPorTiempo() {
		// TODO Auto-generated method stub
		return null;
	}

}
