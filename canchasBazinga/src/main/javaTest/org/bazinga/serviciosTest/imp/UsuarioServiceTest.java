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
	public void registrarTest() {
		Usuario u = new Usuario();
		u.setCorreoElectronico("isifc.facu@gmail.com");
		u.setApellido("aguirre");
		u.setNombre("facundo");
		u.setUsuarioId(17422);
		u.setDni(35038452);
		u.setTelefono(36243);
		usuarioService= new UsuarioService();
		assertNull("error",usuarioService.registrar(u));
	}
	
	@Test
	public void getAllUsuarioTest(){
		
	}
	
	@Test
	public void  loguearseTest(){
		
	}
	
	@Test
	public void eliminarTest(){
		
	}
	
	@Test
	public void modificarTest(){
		
	}

}
