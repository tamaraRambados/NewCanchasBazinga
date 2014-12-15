package org.bazinga.interfaces;

import java.util.List;

import javax.ws.rs.core.Response;

import org.bazinga.entities.Usuario;

public interface IUsuario {
	
	public List<Usuario> getAllUsuario();
    public Response registrar(Usuario usuario);
    public Response eliminar(Usuario usuario);
    public Response modificar(Usuario usuario);
    public boolean loguearse(Usuario usuario);

}
