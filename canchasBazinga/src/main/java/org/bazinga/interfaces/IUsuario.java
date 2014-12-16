package org.bazinga.interfaces;

import java.util.List;

import javax.ws.rs.core.Response;

//import org.bazinga.entities.MensajeEstado;
import org.bazinga.entities.Usuario;

public interface IUsuario {
	
	//public MensajeEstado validar(Usuario usuario);
	public List<Usuario> getAllUsuario();
    public Object registrar(Usuario usuario);
    public Object eliminar(Usuario usuario);
    public Object actualizar(Usuario usuario);
    public boolean loguearse(Usuario usuario);

}
