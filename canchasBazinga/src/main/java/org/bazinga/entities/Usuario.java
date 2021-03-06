package org.bazinga.entities;



import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@XmlRootElement(name="usuarios")//Mapea una clase o una enumeración a un elemento XML. Tiene dos parámetros lo cuales especifícan el name y el namespace que tendrá este elemento en el XML.
@NamedQuery(name = Usuario.FIND_ALL,query = "SELECT u FROM Usuario u")// consulta con nombre
public class Usuario{
	 public static final String FIND_ALL= "Usuario.findAll";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long UsuarioId;

    @OneToMany(fetch=FetchType.LAZY)
    private List<Alquiler> listaAlquileres;

    @ManyToOne
    private Direccion direccion;
    
    @NotNull
    private String correoElectronico;
    @NotNull
	private String nombre;
    @NotNull
	private String apellido;
    @Digits(integer=20,fraction=0)
	private Integer dni;
	
	@Digits(integer=20,fraction=0)
	private Integer telefono;
	
	
	
	public Direccion getDireccion() {
	        return direccion;
	}

	public void setDireccion(Direccion direccion) {
	        this.direccion = direccion;
	}
    public long getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        UsuarioId = usuarioId;
    }
    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
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
   
}

