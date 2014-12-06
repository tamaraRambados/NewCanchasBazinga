package org.bazinga.entities;



import java.sql.Date;

import javax.persistence.*;

@Entity
public class EstadoCuenta{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long establecimientoId;
	
	private Date periodo;
	private Date fechaPago;
	private double importe;
	//pueden faltar atributos 
   
	private UsuarioDueño usuarioDueño;

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public UsuarioDueño getUsuarioDueño() {
		return usuarioDueño;
	}

	public void setUsuarioDueño(UsuarioDueño usuarioDueño) {
		this.usuarioDueño = usuarioDueño;
	}
	
	
}
