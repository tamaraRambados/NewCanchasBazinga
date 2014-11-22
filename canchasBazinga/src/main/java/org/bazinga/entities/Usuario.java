package org.bazinga.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@XmlRootElement(name="usuarios")
@NamedQuery(name = Usuario.FIND_ALL,query = "SELECT u FROM Usuario u")
public class Usuario{
	 public static final String FIND_ALL= "Usuario.findAll";
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdUsuario;
	
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	private String correoElectronico;
	private Integer nroUsuario;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String direccion;
	private Integer telefono;
	private String tipoUsuario;
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
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
	/*
	public Usuario(String correoElectronico, Integer nroUsuario, String nombre,
			String apellido, Integer dni, String direccion, Integer telefono, String tipoUsuario) {
		super();
		this.correoElectronico = correoElectronico;
		this.nroUsuario = nroUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono=telefono;
		this.tipoUsuario=tipoUsuario;
	}
	
	public Usuario(){
		
	}*/
   
}
