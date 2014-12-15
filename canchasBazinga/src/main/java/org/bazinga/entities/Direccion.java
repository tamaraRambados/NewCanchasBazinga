package org.bazinga.entities;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

@Entity
@XmlRootElement(name="direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DireccionId;

    @OneToMany(fetch=FetchType.LAZY)
    private List<Usuario> listaUsuario;
    
    @OneToMany(fetch=FetchType.LAZY)
    private List<Establecimiento> listaEstablecimiento;
    
    @NotNull
    private String calle;
    
    @NotNull
    private int numero;
	public long getDireccionId() {
		return DireccionId;
	}
	public void setDireccionId(long direccionId) {
		DireccionId = direccionId;
	}
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	public List<Establecimiento> getListaEstablecimiento() {
		return listaEstablecimiento;
	}
	public void setListaEstablecimiento(List<Establecimiento> listaEstablecimiento) {
		this.listaEstablecimiento = listaEstablecimiento;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
   
}
