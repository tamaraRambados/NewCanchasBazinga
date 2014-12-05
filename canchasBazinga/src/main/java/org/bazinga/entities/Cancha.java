package org.bazinga.entities;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Entity
@XmlRootElement(name="canchas")
@NamedQuery(name = Cancha.FIND_ALL,query = "SELECT c FROM Cancha c")
public class Cancha {
    public static final String FIND_ALL= "Cancha.findAll";

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int IdCancha;


    @ManyToOne
    private Establecimiento establecimiento;


    private String nombre;
	private String tipo;
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
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

    public int getIdCancha() {
        return IdCancha;
    }

    public void setIdCancha(int idCancha) {
        IdCancha = idCancha;
    }
}
