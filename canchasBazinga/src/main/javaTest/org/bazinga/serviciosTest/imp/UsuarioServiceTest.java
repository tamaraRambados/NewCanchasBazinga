package org.bazinga.serviciosTest.imp;

import static org.junit.Assert.*;

import org.bazinga.entities.Usuario;
import org.bazinga.servicios.UsuarioService;
import org.junit.Before;
import org.junit.Test;

public class UsuarioServiceTest {
	
	Usuario usuario;
	UsuarioService usuarioService;
	

	@Test
	public void test() {
		Usuario u = new Usuario();
		u.setCorreoElectronico("isifc.facu@gmail.com");
		u.setApellido("aguirre");
		u.setNombre("facundo");
		u.setUsuarioId(17422);
		u.setDni(35038452);
		//u.("lopez y planes");
		u.setTelefono(36243);
		u.setTipoUsuario("cliente");
		usuarioService= new UsuarioService();
		
		assertNotNull("error",usuarioService.registrar(u));
	}

}
