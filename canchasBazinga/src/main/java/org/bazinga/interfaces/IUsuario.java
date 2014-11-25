package org.bazinga.interfaces;

import java.util.List;
import org.bazinga.entities.Usuario;

public interface IUsuario {
	public List<Usuario> getAllUsuario();
    public boolean alta(Usuario usuario);
    public boolean baja(Usuario usuario);
    public boolean modificar(Usuario usuario);
    public boolean loguearse(Usuario usuario);

}
