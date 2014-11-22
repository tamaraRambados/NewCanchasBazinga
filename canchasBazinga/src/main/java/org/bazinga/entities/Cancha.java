package org.bazinga.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cancha
 *
 */
@Entity
public class Cancha {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int IdCancha;
	 
	 private Integer codigo;
	 private String nombre;
	 private String tipo;//	
	 private String direccion;
	 private Integer telefono;
	 private String pais;
	 private String provincia;
	 private String localidad;
	 
	/* public Cancha (Integer codigo, String nombre, String tipo,
				String direccion, Integer telefono, String pais, String provincia, String localidad) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.tipo = tipo;
			this.direccion = direccion;
			this.telefono = telefono;
			this.pais=pais;
			this.provincia=provincia;
			this.localidad=localidad;
		}
	public Cancha(){
		super();
	}*/



	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
   
}
