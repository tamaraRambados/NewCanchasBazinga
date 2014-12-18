package org.bazinga.serviceTest;

import java.util.ArrayList;
import java.util.List;

import org.bazinga.entities.Direccion;
import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;
import org.bazinga.interfaces.IUsuario;

public class UsuarioServiceMOCK implements IUsuario{

	private Usuario usuario;
	private static UsuarioServiceMOCK instance;
	private List<Usuario> usuarios= new ArrayList<Usuario>();
	private Direccion direccion;
	
	public static UsuarioServiceMOCK getClase(){
		if (instance== null){
			instance= new UsuarioServiceMOCK();
		}
		return instance;
	}
	
	private UsuarioServiceMOCK() {
		direccion= new Direccion();
		direccion.setCalle("lopez y planes");
		direccion.setDireccionId(1);
		direccion.setNumero(1076);
		
		
		usuario=new Usuario();
		usuario.setApellido("Aguirre");
		usuario.setCorreoElectronico("isifc.facu@gmail.com");
		usuario.setDireccion(direccion);
		usuario.setNombre("facundo");
		usuario.setTelefono(3624);
		usuario.setUsuarioId(1);
		usuarios.add(usuario);
		
		usuario=new Usuario();
		usuario.setApellido("Salinas");
		usuario.setCorreoElectronico("andres@gmail.com");
		usuario.setDireccion(direccion);
		usuario.setNombre("andres");
		usuario.setTelefono(3624);
		usuario.setUsuarioId(2);
		usuarios.add(usuario);
		
		usuario=new Usuario();
		usuario.setApellido("Rambados");
		usuario.setCorreoElectronico("tamaraLorena@gmail.com");
		usuario.setDireccion(direccion);
		usuario.setNombre("Lorena");
		usuario.setTelefono(3624);
		usuario.setUsuarioId(3);
		usuarios.add(usuario);
	}
	
	@Override
	public List<Usuario> getAllUsuario() {
		// TODO Auto-generated method stub
		return usuarios;
	}

	@Override
	public MensajeEstado registrar(Usuario usuario) {
		usuarios.add(usuario);
		return null;
	}

	@Override
	public MensajeEstado eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MensajeEstado actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loguearse(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
