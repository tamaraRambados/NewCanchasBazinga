package org.bazinga.interfaces;

import java.util.List;

import javax.ws.rs.core.Response;


import org.bazinga.entities.MensajeEstado;
//import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;

public interface IUsuario {
	
	//public MensajeEstado validar(Usuario usuario);
	public List<Usuario> getAllUsuario();
    public MensajeEstado registrar(Usuario usuario);
    public MensajeEstado eliminar(Usuario usuario);
    public MensajeEstado actualizar(Usuario usuario);
    public boolean loguearse(Usuario usuario);

}
