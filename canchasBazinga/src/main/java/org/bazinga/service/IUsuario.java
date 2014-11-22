package org.bazinga.service;

import java.util.List;
import org.bazinga.entities.Usuario;

public interface IUsuario {
	public List<Usuario> obtenerTodosLosUsuarios();
}
