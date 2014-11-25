/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.bazinga.presentation;


import javax.inject.Inject;
import javax.inject.Named;

import org.bazinga.entities.Usuario;
import org.bazinga.servicios.UsuarioService;

import java.util.List;

@Named
public class UsuarioBean {

    @Inject
    private UsuarioService usuarioService;
    private List<Usuario> usuarios;
    private String correoElectronico;
	private Integer nroUsuario;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String direccion;
	private Integer telefono;
	private String tipoUsuario;
	
	

    public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Integer getNroUsuario() {
		return nroUsuario;
	}

	public void setNroUsuario(Integer nroUsuario) {
		this.nroUsuario = nroUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


    
    public String fetchUsuarios()
    {
        usuarios=usuarioService.getUsuario();
        return "success";
    }

    public String add()
    {
    	Usuario u= new Usuario();
    	u.setNombre(nombre);
    	u.setApellido(apellido);
    	u.setCorreoElectronico(correoElectronico);
    	u.setDni(dni);
    	u.setNroUsuario(nroUsuario);
    	u.setDireccion(direccion);
    	u.setTelefono(telefono);
    	u.setTipoUsuario(tipoUsuario);
    	//u.setIdUsuario(null);
    /*	u.setNombre("facundo");
    	u.setApellido("aguirre");
    	u.setCorreoElectronico("isifc.facu");
    	u.setDni(35038);
    	u.setNroUsuario(3);
    	u.setDireccion("lopez y planes");
    	u.setTelefono(356);
    	u.setTipoUsuario("cliente");*/
      
        usuarioService.registrarBean(u);
        return "success";
    }
}
